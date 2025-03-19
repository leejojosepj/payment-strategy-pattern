package com.payment.strategy;

import com.payment.enums.PaymentType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaypalPaymentStrategy implements PaymentStrategy {
  /**
   * @param amount
   */
  @Override
  public String doPayment(Double amount) {
    log.info("Proceed with Google Pay payment..");
    /*
     * We can incorporate additional logic here.
     * */
    return String.format("Payment of %.2f has been successfully processed using a Paypal.", amount);
  }

  /**
   * @return
   */
  @Override
  public PaymentType paymentType() {
    return PaymentType.PAYPAL;
  }
}
