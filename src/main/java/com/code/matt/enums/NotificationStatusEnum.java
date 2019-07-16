package com.code.matt.enums;

/**
 * @Author: ming
 * @Date: Created in    19-7-16 下午5:54
 * @Description:
 * @Modified: By
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
