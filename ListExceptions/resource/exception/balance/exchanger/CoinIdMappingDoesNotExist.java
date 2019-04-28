package com.orb.framework.wallet.exception.balance.exchanger;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when there is no corresponding mapping from issuer_coin_id -> vendor_coin_id
 * when fetching the vendor/exchanger balance.
 */
public class CoinIdMappingDoesNotExist extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S0101";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.balance.exchanger.AvailableVendorCoinBalanceService"
          + ".InvalidCoin.message";

  /**
   * Creates an instance of <p>CoinIdMappingDoesNotExist</p>.
   */
  public CoinIdMappingDoesNotExist() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
