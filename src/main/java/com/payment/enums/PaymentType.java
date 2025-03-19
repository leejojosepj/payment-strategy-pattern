package com.payment.enums;

public enum PaymentType {
  CREDIT_CARD,
  PAYPAL,
  GOOGLE_PAY;

  /**
   * Converts a string to the corresponding PaymentType enum. If the input is invalid, returns null
   * or throws an exception.
   *
   * @param paymentType the string representation of the payment type
   * @return PaymentType enum if valid, null otherwise
   */
  public static PaymentType fromString(String paymentType) {
    if (paymentType == null || paymentType.isEmpty()) {
      return null;
    }
    try {
      return PaymentType.valueOf(paymentType);
    } catch (IllegalArgumentException e) {
      return null;
    }
  }
}
