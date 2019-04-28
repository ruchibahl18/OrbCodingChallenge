package com.orb.exception.identifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ExceptionIdentifier {

	final static String csvFile = "ExceptionData.csv";

	final static Map<String, String> serviceTypes = new HashMap<>();
	final static Map<Character, String> errorTypes = new HashMap<>();
	final static List<String> errorCategories = new ArrayList<>();
	static List<List<String>> rows = new ArrayList<>();
	static int srNo = 1;

	public static void main(String[] args) throws IOException {

		InputStream input = new FileInputStream(new File("./resource/messages_ja_JP.properties"));
		File directory = new File("./resource/exception");
		Properties prop = new Properties();
		prop.load(new InputStreamReader(input, Charset.forName("UTF-8")));

		initializeObjects();

		processDirectory(directory, prop);

		StringBuilder sb = new StringBuilder();
		sb.append("Number");
		sb.append(',');
		sb.append("Code");
		sb.append(',');
		sb.append("Service type");
		sb.append(',');
		sb.append("Error type");
		sb.append(",");
		sb.append("Identifier");
		sb.append(",");
		sb.append("Error category");
		sb.append(",");
		sb.append("Message key");
		sb.append(",");
		sb.append("Message content");
		sb.append('\n');

		Writer unicodeFileWriter = new OutputStreamWriter(new FileOutputStream(csvFile), "UTF-8");
		unicodeFileWriter.append(sb);
		rows.stream().filter(row -> !"".equals(row.get(0))).forEach(rowData -> {
			try {
				unicodeFileWriter.append((srNo++) + ",");
				unicodeFileWriter.append(String.join(",", rowData));
				unicodeFileWriter.append("\n");
			} catch (IOException e) {
				e.printStackTrace();
			}

		});
		unicodeFileWriter.close();

	}

	private static void processDirectory(File directory, Properties prop) throws IOException {
		File[] fList = directory.listFiles();
		if (fList != null)
			for (File file : fList) {
				if (file.isFile() && file.getName().contains("Exception.java")) {
					rows.add(extractExceptionDetailsFromFile(file, rows, prop));
				} else if (file.isDirectory()) {
					processDirectory(file, prop);
				}
			}
	}

	private static List<String> extractExceptionDetailsFromFile(File file, List<List<String>> rows, Properties prop)
			throws IOException {
		List<String> row = new ArrayList<>();
		String line = "";
		String serviceType = "";
		String errorType = "";
		int identifier = 0;
		boolean messageKeyPresent = false;
		String errorCategory = "";
		String messageKey = "";
		String messageContent = "";
		String code = "";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		while ((line = reader.readLine()) != null) {
			if (messageKeyPresent && !line.contains(";")) {
				messageKey = messageKey + line;
			}
			if ((line.contains("String MESSAGE_KEY") | messageKeyPresent) && line.contains(";")) {
				messageKey = messageKey + line;
				messageKey = messageKey.split("=")[1];
				messageKey = messageKey.replaceAll("(?!\\.)\\W", "").trim();
				messageKeyPresent = false;
			}
			if (line.contains("ErrorCategory.")) {
				errorCategory = extractErrorCategory(line);
			}
			if (line.contains("String CODE")) {
				code = line.split("=")[1].replace(";", "").trim();
				serviceType = null != serviceTypes.get(code.substring(1, 3)) ? serviceTypes.get(code.substring(1, 3))
						: "";
				errorType = errorTypes.get(code.charAt(3));
				identifier = Integer.parseInt(code.substring(4, 8));
			}
			if (line.contains("String MESSAGE_KEY") && !line.contains(";")) {
				messageKeyPresent = true;
				messageKey = messageKey + line;
			}
		}

		if ("".equals(messageKey)) {
			System.out.println("No message found :" + file.getName());
		} else {
			messageContent = prop.getProperty(messageKey);
			if (null == messageContent) {
				System.out.println("Message key not found : " + messageKey + " in class " + file.getName());
				messageContent = "";
			}
		}

		row.add(code);
		row.add(serviceType);
		row.add(errorType);
		row.add("" + identifier);
		row.add(errorCategory);
		row.add(messageKey);
		row.add(messageContent);

		reader.close();
		return row;

	}

	private static String extractErrorCategory(String line) {
		for (String category : errorCategories) {
			if (line.contains(category)) {
				return category;
			}
		}
		return "";
	}

	public static void initializeObjects() throws IOException {

		serviceTypes.put("00", "IOC Application");
		serviceTypes.put("10", "Auth");
		serviceTypes.put("20", "Wallet Backend");
		serviceTypes.put("30", "Operations");
		serviceTypes.put("40", "VC");

		errorTypes.put('V', "Validation error");
		errorTypes.put('B', "Business error");
		errorTypes.put('S', "System error");

		errorCategories.add("API_ERROR");
		errorCategories.add("AUTHENTICATION_ERROR");
		errorCategories.add("INVALID_REQUEST_ERROR");
		errorCategories.add("TRANSACTION_ERROR");

	}

}
