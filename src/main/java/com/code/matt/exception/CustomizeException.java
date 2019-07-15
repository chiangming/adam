package com.code.matt.exception;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午4:06
 * @Description:
 * @Modified: By
 */
public class CustomizeException extends RuntimeException {
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}