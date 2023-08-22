package com.alireza.security.dto.user;


import com.alireza.security.entity.enumeration.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FindAllUserDto {

    Long id;
    String firstname;
    String lastname;
    Role role;
}
