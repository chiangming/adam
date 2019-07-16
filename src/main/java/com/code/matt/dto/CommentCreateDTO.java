package com.code.matt.dto;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午7:41
 * @Description:
 * @Modified: By
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}