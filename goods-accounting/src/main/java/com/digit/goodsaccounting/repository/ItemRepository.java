package com.digit.goodsaccounting.repository;

import com.digit.goodsaccounting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}