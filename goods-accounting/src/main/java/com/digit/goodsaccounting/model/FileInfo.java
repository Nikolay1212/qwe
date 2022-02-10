package com.digit.goodsaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileInfo implements Serializable {

    private Long id;
    private String storageFileName;
    private String originalFileName;
    private String path;
    private String type;
    private Long size;
}
