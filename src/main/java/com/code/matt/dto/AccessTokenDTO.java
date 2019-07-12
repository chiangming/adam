package com.code.matt.dto;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-9 下午6:41
 * @Description:
 * @Modified: By
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
