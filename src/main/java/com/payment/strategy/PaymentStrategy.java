package com.payment.strategy;

import com.payment.enums.PaymentType;

public interface PaymentStrategy {

  String doPayment(Double amount);

  PaymentType paymentType();
}
