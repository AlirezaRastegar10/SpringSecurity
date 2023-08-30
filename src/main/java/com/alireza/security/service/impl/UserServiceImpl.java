package com.alireza.security.service.impl;


import com.alireza.security.dto.user.FindAllUserDto;
import com.alireza.security.mappers.UserMapperImpl;
import com.alireza.security.repository.UserRepository;
import com.alireza.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapperImpl userMapper;

    @Override
    public List<FindAllUserDto> findAll() {
        return userMapper.userListToUserDtoList(userRepository.findAll());
    }

    @Override
    public void delete(Long id) {
        var user = userRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("no user found with this id")
        );
        userRepository.delete(user);
    }
}
