package com.alireza.security.mappers;


import com.alireza.security.dto.auth.RegisterRequest;
import com.alireza.security.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", ignore = true)
    User registerRequestDtoToUser(RegisterRequest request);
}
