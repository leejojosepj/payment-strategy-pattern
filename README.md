# payment-strategy-pattern
The Payment Strategy Pattern project demonstrates the implementation of the Strategy Design Pattern in a payment system.

## Overview
This project demonstrates the **Strategy Pattern** in a payment processing system using **Spring Boot 3 & Spring 6**.  
It provides a simple use case to understand how different payment methods can be handled dynamically using the **Strategy Design Pattern**.

## How It Works
- The application exposes an endpoint to process payments based on a given **payment type** and **amount**.
- The payment type and amount are passed as **path variables** in the API request.
- Internally, a **Strategy Pattern** is used to select the appropriate payment strategy dynamically.

## API Endpoint

```
GET /{paymentType}/{amount}
```

- `paymentType`: The type of payment (e.g., `CREDIT_CARD`, `DEBIT_CARD`, `PAYPAL`).
- `amount`: The amount to be processed.

### Example Request and Response
```
GET /CREDIT_CARD/500.00
```

```
"Payment processed for 500.00 using Credit Card"
```

## ⚠️ Important Note

- **This implementation is purely for learning purposes** to demonstrate how the **Strategy Pattern** works in a payment system.
- **In real-world applications, payment processing is a highly secure operation** that requires proper authentication, encryption, and fraud prevention mechanisms.
- **This example does not include any security features** and **should not be used in production environments**.  



### Check the link :
https://medium.com/@leejojosepj_76404/strategy-design-pattern-using-java-41061228f8bf



