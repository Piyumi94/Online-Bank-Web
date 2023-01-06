package com.example.bankingservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingservices.model.entity.BankAccountEntity;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
    Optional<BankAccountEntity> findByNumber(String accountNumber);
	

}
