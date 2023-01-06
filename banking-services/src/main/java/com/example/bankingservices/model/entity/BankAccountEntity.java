package com.example.bankingservices.model.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import com.example.bankingservices.model.AccountStatus;
import com.example.bankingservices.model.AccountType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "banking_core_account")

public class BankAccountEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String number;

	@Enumerated(EnumType.STRING)
	private AccountType type;

	@Enumerated(EnumType.STRING)
	private AccountStatus status;

	private BigDecimal availableBalance;

	private BigDecimal actualBalance;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
    private UserEntity user;

}
