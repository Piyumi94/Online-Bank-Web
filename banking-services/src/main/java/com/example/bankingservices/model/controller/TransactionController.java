package com.example.bankingservices.model.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankingservices.model.dto.request.FundTransferRequest;
import com.example.bankingservices.model.dto.request.UtilityPaymentRequest;
import com.example.bankingservices.service.TransactionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/transaction")
public class TransactionController {

	private final TransactionService transactionService;

	@PostMapping("/fund-transfer")
	public ResponseEntity fundTransfer(@RequestBody FundTransferRequest fundTransferRequest) {

		log.info("Fund transfer initiated in core bank from {}", fundTransferRequest.toString());
		return ResponseEntity.ok(transactionService.fundTransfer(fundTransferRequest));

	}

	@PostMapping("/util-payment")
	public ResponseEntity utilPayment(@RequestBody UtilityPaymentRequest utilityPaymentRequest) {

		log.info("Utility Payment initiated in core bank from {}", utilityPaymentRequest.toString());
		return ResponseEntity.ok(transactionService.utilPayment(utilityPaymentRequest));
	}

}