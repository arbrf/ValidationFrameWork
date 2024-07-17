package com.validation.Validation.Framwwork.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionReqRes {

    private Integer id;
    private long userId; // Consider using Long for userId to handle potential null values
    private Integer paymentMethodId;
    private Integer providerId;
    private Integer paymentTypeId;
    private double amount;
    private String currency;
    private Integer txnStatusId;
    private String txnReference;
    private Integer txnDetailsId;
    private String providerCode;
    private String providerMessage;
    private String debitorAccount;
    private String creditorAccount;
    private String merchantTransactionReference;

    // Getters and Setters are generated by Lombok's @Data annotation

    // You might want to add additional methods or business logic here if needed
}
