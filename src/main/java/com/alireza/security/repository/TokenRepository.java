package com.alireza.security.repository;


import com.alireza.security.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    @Query("select t from Token as t where t.user.id=?1 and (t.expired = false or t.revoked = false )")
    List<Token> findAllValidTokensById(Long userId);

    Optional<Token> findByToken(String token);
}
