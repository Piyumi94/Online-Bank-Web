package com.example.bankingservices.model.mapper;

import org.springframework.beans.BeanUtils;

import com.example.bankingservices.model.dto.BankAccount;
import com.example.bankingservices.model.entity.BankAccountEntity;

public class BankAccountMapper extends BaseMapper<BankAccountEntity, BankAccount> {

	@Override
	public BankAccountEntity convertToEntity(BankAccount dto, Object... args) {
        BankAccountEntity entity = new BankAccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "user");
        }
        return entity;
    }
	
	@Override
	public BankAccount convertToDto(BankAccountEntity entity, Object... args) {
        BankAccount dto = new BankAccount();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto, "user");
        }
        return dto;
    }
	
}
