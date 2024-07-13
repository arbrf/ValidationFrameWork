package com.validation.Validation.Framwwork.validator;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.validation.Validation.Framwwork.enums.ErrorCodeEnum;
import com.validation.Validation.Framwwork.exceptions.ValidationException;
import com.validation.Validation.Framwwork.pojo.PaymentRequest;
import com.validation.Validation.Framwwork.pojo.PaymentResponse;
@Component
public class PaymentFilterPaymentRequestValidator implements Validator {
	@Override
	public void doValidate(PaymentRequest paymentRequest) {
		// TODO Auto-generated method stub

        // Basic validation
        if (paymentRequest == null) {
        	
        	System.out.println("No Json data00");
        	throw new ValidationException(HttpStatus.BAD_REQUEST,
					ErrorCodeEnum.PAYMENT_REQUEST_VALIDATION_FAILED.getErrorCode(),
					ErrorCodeEnum.PAYMENT_REQUEST_VALIDATION_FAILED.getErrorMessage());
        }

    	if(null == paymentRequest.getPayment()) {
    		
    		System.out.println("No Payment data00");
			throw new ValidationException(HttpStatus.BAD_REQUEST,
					ErrorCodeEnum.PAYMENT_VALIDATION_FAILED.getErrorCode(),
					ErrorCodeEnum.PAYMENT_VALIDATION_FAILED.getErrorMessage());
		}
		
		if(null == paymentRequest.getUser()) {
			throw new ValidationException(HttpStatus.BAD_REQUEST,
					ErrorCodeEnum.USER_VALIDATION_FAILED.getErrorCode(),
					ErrorCodeEnum.USER_VALIDATION_FAILED.getErrorMessage());
		}
		
	}

}
