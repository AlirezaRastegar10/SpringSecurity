package com.alireza.security.mappers;


import com.alireza.security.dto.user.FindAllUserDto;
import com.alireza.security.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "tokens", ignore = true)
    List<FindAllUserDto> userListToUserDtoList(List<User> users);
}
