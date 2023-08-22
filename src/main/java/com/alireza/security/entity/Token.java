package com.alireza.security.entity;


import com.alireza.security.entity.enumeration.TokenType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    String token;

    @Enumerated(value = EnumType.STRING)
    TokenType tokenType;

    boolean expired;
    boolean revoked;

    @ManyToOne
    User user;
}
