package com.digit.goodsaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Item implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private Map<String, String> props;
}
