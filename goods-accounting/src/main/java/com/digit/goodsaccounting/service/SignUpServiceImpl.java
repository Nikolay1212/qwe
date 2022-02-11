package com.digit.goodsaccounting.service;

import com.digit.goodsaccounting.form.SignUpForm;
import com.digit.goodsaccounting.model.Account;
import com.digit.goodsaccounting.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public void signUp(SignUpForm form) {
        Account account = Account.builder()
                .login(form.getLogin())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .state(Account.State.CONFIRMED)
                .role(Account.Role.USER.USER)
                .build();
        accountRepository.save(account);
    }
}
