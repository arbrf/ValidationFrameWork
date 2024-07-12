package com.validation.Validation.Framwwork.Service;

import org.springframework.stereotype.Component;

import com.validation.Validation.Framwwork.pojo.PaymentRequest;
import com.validation.Validation.Framwwork.pojo.PaymentResponse;
@Component
public class PaymentService {

    public PaymentResponse validateAndInitiatePayment(PaymentRequest paymentRequest) {
        PaymentResponse paymentResponse = new PaymentResponse();

        // Basic validation
        if (paymentRequest == null) {
            paymentResponse.setErrorCode("400");
            paymentResponse.setErrorMessage("Invalid request: paymentRequest is null.");
            return paymentResponse;
        }

        if (paymentRequest.getPayment().getAmount() <= 0) {
            paymentResponse.setErrorCode("400");
            paymentResponse.setErrorMessage("Invalid request: Amount should be greater than 0.");
            return paymentResponse;
        }

        if (paymentRequest.getPayment() == null || paymentRequest.getPayment().getPaymentMethod().isEmpty()) {
            paymentResponse.setErrorCode("400");
            paymentResponse.setErrorMessage("Invalid request: Payment method is required.");
            return paymentResponse;
        }

        // Assume we have a method to initiate payment and get a payment reference
        try {
            String paymentReference = initiatePayment(paymentRequest);
            paymentResponse.setPaymentReference(paymentReference);
            paymentResponse.setRedirectUrl("http://example.com/redirect");
            paymentResponse.setErrorCode("200");
            paymentResponse.setErrorMessage("Payment successful.");
        } catch (Exception e) {
            paymentResponse.setErrorCode("500");
            paymentResponse.setErrorMessage("Payment initiation failed: " + e.getMessage());
        }

        return paymentResponse;
    }

    // Simulate payment initiation
    private String initiatePayment(PaymentRequest paymentRequest) throws Exception {
        // Logic to initiate payment
        // For demonstration, we'll just return a dummy payment reference
        if (paymentRequest.getPayment().getPaymentMethod().equals("invalid")) {
            throw new Exception("Invalid payment method.");
        }
        return "PAY1234567890";
    }
}
