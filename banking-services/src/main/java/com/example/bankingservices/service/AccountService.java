package com.example.bankingservices.service;

import org.springframework.stereotype.Service;

import com.example.bankingservices.model.dto.BankAccount;
import com.example.bankingservices.model.dto.UtilityAccount;
import com.example.bankingservices.model.entity.BankAccountEntity;
import com.example.bankingservices.model.entity.UtilityAccountEntity;
import com.example.bankingservices.model.mapper.BankAccountMapper;
import com.example.bankingservices.model.mapper.UtilityAccountMapper;
import com.example.bankingservices.repository.BankAccountRepository;
import com.example.bankingservices.repository.UtilityAccountRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class AccountService {
	private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id){
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }
}
