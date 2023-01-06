package com.example.bankingservices.model.dto;

import java.math.BigDecimal;

import com.example.bankingservices.model.AccountStatus;
import com.example.bankingservices.model.AccountType;

import lombok.Data;

@Data
public class BankAccount {
	
	private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
