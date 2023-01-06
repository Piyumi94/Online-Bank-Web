package com.example.bankingservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingservices.model.entity.UtilityAccountEntity;

public interface UtilityAccountRepository extends JpaRepository<UtilityAccountEntity, Long> {

	Optional<UtilityAccountEntity> findByProviderName(String provider);
}
