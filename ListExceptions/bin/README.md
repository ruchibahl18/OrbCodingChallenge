Task
----

Build a script that walks a directory tree of Java class files and outputs a CSV file with the list of exception-type classes found. Enums, Handlers, etc. should be ignored.
In addition, there is a message content file (`messages_ja_JP.properties`) that should be mapped to get the corresponding error message included in the CSV file output.

![csv_output](https://user-images.githubusercontent.com/34642605/56260463-46676e80-6112-11e9-99c4-9e5728caa1b4.png)


Specifications 
--------------

The values in the CSV file should be:
- Number (a sequential identifier for the exception)
- Code (7 characters)
    - Service type (2 characters):
        - 00: IOC Application
        - 10: Auth
        - 20: Wallet Backend
        - 30: Operations
        - 40: VC
    - Error type (1 character):
        - V: Validation error
        - B: Business error
        - S: System error
    - Identifier (4 characters)
        - 0000 - 9999
- Service type
- Error type
- Identifier
- Error category
    - API_ERROR
    - AUTHENTICATION_ERROR
    - INVALID_REQUEST_ERROR
    - TRANSACTION_ERROR
- Message key
- Message content

(BONUS) The program should output a message when:
- it finds an exception without a corresponding message (output the exception class name)
- it finds a message without a corresponding exception (output the message key)


Notes
-----

- You can choose any programming languange and framework. 
- Please submit GitHub URL of the source code for your program.
