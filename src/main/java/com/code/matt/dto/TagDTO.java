package com.code.matt.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: ming
 * @Date: Created in    19-7-16 下午5:04
 * @Description:
 * @Modified: By
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}