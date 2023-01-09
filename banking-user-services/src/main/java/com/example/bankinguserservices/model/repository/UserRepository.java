package com.example.bankinguserservices.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankinguserservices.model.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>  {

}
