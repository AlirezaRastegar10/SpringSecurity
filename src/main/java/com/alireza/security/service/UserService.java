package com.alireza.security.service;

import com.alireza.security.dto.user.FindAllUserDto;

import java.util.List;

public interface UserService {

    List<FindAllUserDto> findAll();
    void delete(Long id);
}
