package com.example.bankinguserservices.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankinguserservices.model.dto.User;
import com.example.bankinguserservices.model.dto.UserUpdateRequest;
import com.example.bankinguserservices.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/bank-user")
@RequiredArgsConstructor
public class UserController {
	
	//private final KeycloakUserService keycloakUserService;
    private final UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity createUser(@RequestBody User request) {
        log.info("Creating user with {}", request.toString());
        return ResponseEntity.ok(userService.createUser(request));
    }

	/*
	 * @PatchMapping(value = "/update/{id}") public ResponseEntity
	 * updateUser(@PathVariable("id") Long userId, @RequestBody UserUpdateRequest
	 * userUpdateRequest) { log.info("Updating user with {}",
	 * userUpdateRequest.toString()); return
	 * ResponseEntity.ok(userService.updateUser(userId, userUpdateRequest)); }
	 * 
	 * @GetMapping public ResponseEntity readUsers(Pageable pageable) {
	 * log.info("Reading all users from API"); return
	 * ResponseEntity.ok(userService.readUsers(pageable)); }
	 */

    @GetMapping(value = "/{id}")
    public ResponseEntity readUser(@PathVariable("id") Long id) {
        log.info("Reading user by id {}", id);
        return ResponseEntity.ok(userService.readUser(id));
    }
}
