package com.validation.Validation.Framwwork.pojo;

public class Payment {
	 	private String paymentMethod;
	    private String paymentType;
	    private int amount;
	    private String currency;
	    private String merchantTransactionReference;
	    private String providerId;
	    private String creditorAccount;
	    private String debitorAccount;
	    public Payment() {
			// TODO Auto-generated constructor stub
		}
		public Payment(String paymentMethod, String paymentType, int amount, String currency,
				String merchantTransactionReference, String providerId, String creditorAccount, String debitorAccount) {
			super();
			this.paymentMethod = paymentMethod;
			this.paymentType = paymentType;
			this.amount = amount;
			this.currency = currency;
			this.merchantTransactionReference = merchantTransactionReference;
			this.providerId = providerId;
			this.creditorAccount = creditorAccount;
			this.debitorAccount = debitorAccount;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public String getPaymentType() {
			return paymentType;
		}
		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getMerchantTransactionReference() {
			return merchantTransactionReference;
		}
		public void setMerchantTransactionReference(String merchantTransactionReference) {
			this.merchantTransactionReference = merchantTransactionReference;
		}
		public String getProviderId() {
			return providerId;
		}
		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}
		public String getCreditorAccount() {
			return creditorAccount;
		}
		public void setCreditorAccount(String creditorAccount) {
			this.creditorAccount = creditorAccount;
		}
		public String getDebitorAccount() {
			return debitorAccount;
		}
		public void setDebitorAccount(String debitorAccount) {
			this.debitorAccount = debitorAccount;
		}
		@Override
		public String toString() {
			return "Payment [paymentMethod=" + paymentMethod + ", paymentType=" + paymentType + ", amount=" + amount
					+ ", currency=" + currency + ", merchantTransactionReference=" + merchantTransactionReference
					+ ", providerId=" + providerId + ", creditorAccount=" + creditorAccount + ", debitorAccount="
					+ debitorAccount + "]";
		}
	    
}