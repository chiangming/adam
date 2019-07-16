package com.code.matt.dto;

import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-16 下午5:52
 * @Description:
 * @Modified: By
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}