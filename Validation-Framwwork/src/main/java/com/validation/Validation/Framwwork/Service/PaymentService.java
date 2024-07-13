package com.validation.Validation.Framwwork.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.validation.Validation.Framwwork.enums.ValidatorEnum;
import com.validation.Validation.Framwwork.pojo.PaymentRequest;
import com.validation.Validation.Framwwork.pojo.PaymentResponse;
import com.validation.Validation.Framwwork.validator.PaymentFilterPaymentRequestValidator;
import com.validation.Validation.Framwwork.validator.Validator;
@Component
public class PaymentService {
	@Autowired
	private ApplicationContext context;
	
	@Value("${payment.validators}")
	private String validators;
    public PaymentResponse validateAndInitiatePayment(PaymentRequest paymentRequest) {
        PaymentResponse paymentResponse = new PaymentResponse();
        

		List<String> validatorList = Stream.of(validators.split(",")).collect(Collectors.toList());

		validatorList.forEach(validator -> {
			ValidatorEnum validatorEnum = ValidatorEnum.getEnumByString(validator);
			
			Supplier<? extends Validator> validatorSupplier = () -> context.getBean(PaymentFilterPaymentRequestValidator.class);
			validatorSupplier.get().doValidate(paymentRequest);
		});

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
