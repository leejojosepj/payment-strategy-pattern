package com.ljp.payment.service;

import com.ljp.payment.enums.PaymentType;
import com.ljp.payment.strategy.PaymentStrategy;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PaymentServiceImpl implements PaymentService {

  private final Map<PaymentType, PaymentStrategy> doPaymentByPaymetType;

  /**
   * @param paymentType as String
   * @return
   */
  @Override
  public String doPayment(String paymentType, Double amount) {

    PaymentStrategy paymentStrategy =
        doPaymentByPaymetType.getOrDefault(PaymentType.fromString(paymentType), null);
    if (paymentStrategy != null) {
      return paymentStrategy.doPayment(amount);
    } else {
      return "Invalid payment type. No strategy found.";
    }
  }
}
