package com.code.matt.model;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-10 下午3:33
 * @Description:
 * @Modified: By
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
