package com.validation.Validation.Framwwork.Controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.log.LogMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.Validation.Framwwork.Service.PaymentService;
import com.validation.Validation.Framwwork.constants.Endpoint;
import com.validation.Validation.Framwwork.pojo.PaymentRequest;
import com.validation.Validation.Framwwork.pojo.PaymentResponse;

@RestController
@RequestMapping(Endpoint.VALIDATION_MAPPING)
public class PaymentsController {

	private static final Logger LOGGER = LogManager.getLogger(PaymentsController.class);

	@Autowired
	private PaymentService paymentService;

	@PostMapping(value = Endpoint.INITIATE_PAYMENT)
	public ResponseEntity<PaymentResponse> sale(@RequestBody PaymentRequest paymentRequest) {
		
		System.out.println("Method called");
		return new ResponseEntity<>(paymentService.validateAndInitiatePayment(paymentRequest), HttpStatus.CREATED);
	}
}