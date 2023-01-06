package com.example.bankingservices.model.mapper;

import org.springframework.beans.BeanUtils;

import com.example.bankingservices.model.dto.UtilityAccount;
import com.example.bankingservices.model.entity.UtilityAccountEntity;

public class UtilityAccountMapper extends BaseMapper<UtilityAccountEntity, UtilityAccount> {

	@Override
	public UtilityAccountEntity convertToEntity(UtilityAccount dto, Object... args) {
        UtilityAccountEntity entity = new UtilityAccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }
	
	@Override
	public UtilityAccount convertToDto(UtilityAccountEntity entity, Object... args) {
        UtilityAccount dto = new UtilityAccount();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
