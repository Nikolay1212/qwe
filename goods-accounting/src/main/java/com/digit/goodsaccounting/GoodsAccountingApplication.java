package com.digit.goodsaccounting;

import com.digit.goodsaccounting.repository.ItemRepository;
import com.digit.goodsaccounting.security.handler.MySimpleUrlAuthenticationSuccessHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ItemRepository.class)
public class GoodsAccountingApplication {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler() {
        return new MySimpleUrlAuthenticationSuccessHandler();
    }

    public static void main(String[] args) {
        SpringApplication.run(GoodsAccountingApplication.class, args);
    }
}
