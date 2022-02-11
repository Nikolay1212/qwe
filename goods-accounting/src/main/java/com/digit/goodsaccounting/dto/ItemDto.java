package com.digit.goodsaccounting.dto;

import com.digit.goodsaccounting.model.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {

    private String id;
    private String name;
    private Map<String, String> props;

    public static ItemDto from(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .name(item.getName())
                .props(item.getProps())
                .build();
    }

    public static List<ItemDto> from(List<Item> items) {
        return items.stream().map(ItemDto::from).collect(Collectors.toList());
    }
}
