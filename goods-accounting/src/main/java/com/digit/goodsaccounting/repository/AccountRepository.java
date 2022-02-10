package com.digit.goodsaccounting.repository;

import com.digit.goodsaccounting.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccountRepository extends MongoRepository<Account, Long> {
    Optional<Account> findAccountByLogin(String login);
}
