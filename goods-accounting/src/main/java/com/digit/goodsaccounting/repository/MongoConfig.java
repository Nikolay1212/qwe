package com.digit.goodsaccounting.repository;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.uri}")
    private String mongoConnectionString;

    @Value("${spring.data.mongodb.database}")
    private String mongoDatabaseName;

    @Override
    protected String getDatabaseName() {
        return mongoDatabaseName;
    }
    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString(mongoConnectionString);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }
    @Override
    public Collection getMappingBasePackages() {
        return Collections.singleton("com");
    }
}
