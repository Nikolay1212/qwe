package com.digit.goodsaccounting.service;

import com.digit.goodsaccounting.model.Item;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ItemService {
    List<Item> getAllItem();
    void save(MultipartFile file);
}
