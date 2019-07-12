package com.code.matt.dto;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-9 下午7:26
 * @Description:
 * @Modified: By
 */
@Data
public class GithubUserDTO {
    private String login;
    private Long id;
    private String bio;
    private String avatar_url;
}
