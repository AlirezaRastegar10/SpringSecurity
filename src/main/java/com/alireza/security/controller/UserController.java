package com.alireza.security.controller;


import com.alireza.security.dto.user.FindAllUserDto;
import com.alireza.security.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping("/find-all")
    public ResponseEntity<List<FindAllUserDto>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
