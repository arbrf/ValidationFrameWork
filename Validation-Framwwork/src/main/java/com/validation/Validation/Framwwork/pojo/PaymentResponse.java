package com.validation.Validation.Framwwork.pojo;

public class PaymentResponse {
	private String paymentReference;
	private String redirectUrl;
	private String errorCode;
	private String errorMessage;
	public PaymentResponse() {
		// TODO Auto-generated constructor stub
	}
	private PaymentResponse(Builder builder) {
        this.paymentReference = builder.paymentReference;
        this.redirectUrl = builder.redirectUrl;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String paymentReference;
        private String redirectUrl;
        private String errorCode;
        private String errorMessage;

        public Builder paymentReference(String paymentReference) {
            this.paymentReference = paymentReference;
            return this;
        }

        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public PaymentResponse build() {
            return new PaymentResponse(this);
        }
    }
	public String getPaymentReference() {
		return paymentReference;
	}
	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "PaymentResponse [paymentReference=" + paymentReference + ", redirectUrl=" + redirectUrl + ", errorCode="
				+ errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	
}