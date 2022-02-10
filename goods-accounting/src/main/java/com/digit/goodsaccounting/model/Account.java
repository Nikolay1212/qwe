package com.digit.goodsaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Account {

    @Id
    private String id;
    private String login;
    private String hashPassword;

    private Role role;
    private State state;

    public enum Role {
        ADMIN,
        USER
    }
    public enum State {
        CONFIRMED,
        NOT_CONFIRMED,
        BANNED
    }
}
