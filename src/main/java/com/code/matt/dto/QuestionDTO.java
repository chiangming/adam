package com.code.matt.dto;

import com.code.matt.model.User;
import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-12 下午11:31
 * @Description:
 * @Modified: By
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
