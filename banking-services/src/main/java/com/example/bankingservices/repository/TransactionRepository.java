package com.example.bankingservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingservices.model.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

}
