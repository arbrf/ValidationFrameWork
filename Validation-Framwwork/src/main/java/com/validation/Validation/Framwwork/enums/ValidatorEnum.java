package com.validation.Validation.Framwwork.enums;

import com.validation.Validation.Framwwork.validator.PaymentFilterPaymentRequestValidator;
import com.validation.Validation.Framwwork.validator.Validator;

public enum ValidatorEnum {
    
    PAYMENT_REQUEST_FILTER("PAYMENT_REQUEST_FILTER", PaymentFilterPaymentRequestValidator.class);
    
    private String validatorName;
    private Class<? extends Validator> validatorClass;

    ValidatorEnum(String validatorName, Class<? extends Validator> validatorClass) {
        this.validatorName = validatorName;
        this.validatorClass = validatorClass;
    }

    public String getValidatorName() {
        return validatorName;
    }

    public void setValidatorName(String validatorName) {
        this.validatorName = validatorName;
    }

    public Class<? extends Validator> getValidatorClass() {
        return validatorClass;
    }

    public void setValidatorClass(Class<? extends Validator> validatorClass) {
        this.validatorClass = validatorClass;
    }

    public static ValidatorEnum getEnumByString(String name) {
        for (ValidatorEnum e : ValidatorEnum.values()) {
            if (name.equals(e.validatorName)) {
                return e;
            }
        }
        return null;
    }
}
