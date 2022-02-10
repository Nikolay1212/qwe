package com.digit.goodsaccounting.repository;

import com.digit.goodsaccounting.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}