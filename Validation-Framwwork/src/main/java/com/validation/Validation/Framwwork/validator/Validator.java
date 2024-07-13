package com.validation.Validation.Framwwork.validator;

import com.validation.Validation.Framwwork.pojo.PaymentRequest;

public interface Validator {
	void doValidate(PaymentRequest paymentRequest);
}
