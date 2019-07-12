package com.code.matt.model;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-12 下午7:50
 * @Description:
 * @Modified: By
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
