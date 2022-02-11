package com.digit.goodsaccounting.service;

import com.digit.goodsaccounting.dto.ItemDto;
import com.digit.goodsaccounting.model.Item;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ItemService {
    List<ItemDto> getAllItem();
    void save(MultipartFile file);
}
