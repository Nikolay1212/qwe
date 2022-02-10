package com.digit.goodsaccounting.repository;

import com.digit.goodsaccounting.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findAccountByLogin(String login);
}
