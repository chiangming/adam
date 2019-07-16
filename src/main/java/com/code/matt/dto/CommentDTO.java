package com.code.matt.dto;

import com.code.matt.model.User;
import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午7:41
 * @Description:
 * @Modified: By
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}