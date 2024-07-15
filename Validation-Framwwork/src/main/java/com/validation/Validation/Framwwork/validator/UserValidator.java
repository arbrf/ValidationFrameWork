package com.validation.Validation.Framwwork.validator;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.validation.Validation.Framwwork.enums.ErrorCodeEnum;
import com.validation.Validation.Framwwork.exceptions.ValidationException;
import com.validation.Validation.Framwwork.pojo.PaymentRequest;
import com.validation.Validation.Framwwork.pojo.User;

@Component
public class UserValidator implements Validator {

    @Override
    public void doValidate(PaymentRequest paymentRequest) {
        // Basic User validation
        if (paymentRequest.getUser() == null) {
            throw new ValidationException(HttpStatus.BAD_REQUEST,
                    ErrorCodeEnum.USER_VALIDATION_FAILED.getErrorCode(),
                    ErrorCodeEnum.USER_VALIDATION_FAILED.getErrorMessage());
        }

        // Add specific validation rules for User fields
        if (paymentRequest.getUser().getId() == null) {
            throw new ValidationException(HttpStatus.BAD_REQUEST,
                    ErrorCodeEnum.PROVIDER_ID_VALIDATION_FAILED.getErrorCode(),
                    ErrorCodeEnum.PROVIDER_ID_VALIDATION_FAILED.getErrorMessage());
        }

        // Add more validation checks as needed
        // For example:
        // - Email format validation
        // - Username length validation

    }

	
}

