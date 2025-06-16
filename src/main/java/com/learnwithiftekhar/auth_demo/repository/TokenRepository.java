package com.learnwithiftekhar.auth_demo.repository;

import com.learnwithiftekhar.auth_demo.entity.Token;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TokenRepository extends CrudRepository<Token, Long> {
    Optional<Token> findByToken(String token);
}
