package com.code.matt.dto;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-16 下午11:11
 * @Description:
 * @Modified: By
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}