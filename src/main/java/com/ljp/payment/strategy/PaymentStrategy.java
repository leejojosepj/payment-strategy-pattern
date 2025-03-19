package com.ljp.payment.strategy;

import com.ljp.payment.enums.PaymentType;

public interface PaymentStrategy {

  String doPayment(Double amount);

  PaymentType paymentType();
}
