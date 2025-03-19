package com.payment.controller;

import com.payment.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/payment-service")
public class PaymentController {

  private final PaymentService paymentService;

  /**
   * Processes a payment based on the provided payment type and amount.
   *
   * <p>This controller method accepts the payment type and amount as path variables. In a
   * real-world scenario, payment processing involves high-security measures, including
   * authentication, encryption, and fraud prevention. However, this implementation is solely for
   * demonstrating the Strategy Pattern in a simplified use case.
   *
   * @param paymentType the type of payment as a string (e.g., "CREDIT_CARD", "PAYPAL",
   *     "GOOGLE_PAY")
   * @param amount the amount to be processed
   * @return a response message indicating the payment result
   * @throws IllegalArgumentException if the payment type is invalid
   */
  @GetMapping("/{paymentType}/{amount}")
  public String dopayment(@PathVariable String paymentType, @PathVariable Double amount) {

    return paymentService.doPayment(paymentType, amount);
  }
}
