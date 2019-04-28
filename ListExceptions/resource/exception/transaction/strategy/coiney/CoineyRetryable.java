package com.orb.framework.wallet.exception.transaction.strategy.coiney;

import com.orb.framework.wallet.application.transaction.coiney.CoineyExecuteRequest;
import com.orb.framework.wallet.application.transaction.coiney.CoineyTransactionController;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If this annotation is attached to an exception thrown
 * by {@link CoineyTransactionController#execute(String, String, CoineyExecuteRequest)},
 * it denotes that the execute operation should be retried by the coiney webhook.
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.TYPE)
public @interface CoineyRetryable {
}
