package com.validation.Validation.Framwwork.pojo;

public class PaymentResponse {
	private String paymentReference;
	private String redirectUrl;
	private String errorCode;
	private String errorMessage;
	public PaymentResponse() {
		// TODO Auto-generated constructor stub
	}
	public PaymentResponse(String paymentReference, String redirectUrl, String errorCode, String errorMessage) {
		super();
		this.paymentReference = paymentReference;
		this.redirectUrl = redirectUrl;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
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