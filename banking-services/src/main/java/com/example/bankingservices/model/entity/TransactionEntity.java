package com.example.bankingservices.model.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import com.example.bankingservices.model.TransactionType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "banking_core_transaction")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;

		    private BigDecimal amount;
		    
	@Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private String referenceNumber;

    private String transactionId;	
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private BankAccountEntity account;
}
