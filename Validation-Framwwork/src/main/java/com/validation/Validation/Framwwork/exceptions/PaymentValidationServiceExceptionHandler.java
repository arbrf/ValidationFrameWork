package com.validation.Validation.Framwwork.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.validation.Validation.Framwwork.enums.ErrorCodeEnum;
import com.validation.Validation.Framwwork.pojo.PaymentResponse;

@ControllerAdvice
public class PaymentValidationServiceExceptionHandler {


	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<PaymentResponse> handleValidationException(ValidationException ex) {
		PaymentResponse paymentResponse = PaymentResponse.builder().errorCode(ex.getErrorCode())
				.errorMessage(ex.getErrorMessage()).build();
		return new ResponseEntity<>(paymentResponse, ex.getHttpStatus());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<PaymentResponse> handleGenericException(Exception ex) {
		PaymentResponse paymentResponse = PaymentResponse.builder()
				.errorCode(ErrorCodeEnum.GENERIC_EXCEPTION.getErrorCode())
				.errorMessage(ErrorCodeEnum.GENERIC_EXCEPTION.getErrorMessage()).build();
		return new ResponseEntity<>(paymentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}