package com.example.bankingservices.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.bankingservices.model.dto.User;
import com.example.bankingservices.model.entity.UserEntity;
import com.example.bankingservices.model.mapper.UserMapper;
import com.example.bankingservices.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private UserMapper userMapper = new UserMapper();

	private final UserRepository userRepository;

	public User readUser(String identification) {
		UserEntity userEntity = userRepository.findByIdentificationNumber(identification).get();
		return userMapper.convertToDto(userEntity);
	}

	public List<User> readUsers(Pageable pageable) {
		return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
	}
}