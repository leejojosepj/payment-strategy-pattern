package com.ljp.payment.config;

import com.ljp.payment.enums.PaymentType;
import com.ljp.payment.strategy.PaymentStrategy;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class PaymentStrategyConfig {
  private final List<PaymentStrategy> paymentStrategyList;

  /**
   * Creates a bean that provides a mapping between {@link PaymentType} and its corresponding {@link
   * PaymentStrategy} implementation.
   *
   * <p>This method initializes an {@link EnumMap} to efficiently store the mapping of payment types
   * to their respective strategy implementations. It iterates over the {@code paymentStrategyList}
   * and populates the map.
   *
   * @return a {@link Map} where the key is {@link PaymentType} and the value is its associated
   *     {@link PaymentStrategy}
   */
  @Bean
  public Map<PaymentType, PaymentStrategy> doPaymentByPaymetType() {

    Map<PaymentType, PaymentStrategy> paymentLogicStrategyMap = new EnumMap<>(PaymentType.class);

    paymentStrategyList.forEach(
        paymentLogicStrategy ->
            paymentLogicStrategyMap.put(paymentLogicStrategy.paymentType(), paymentLogicStrategy));

    return paymentLogicStrategyMap;
  }
}
