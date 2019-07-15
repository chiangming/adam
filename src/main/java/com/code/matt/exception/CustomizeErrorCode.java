package com.code.matt.exception;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午4:05
 * @Description:
 * @Modified: By
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("The problem you're looking for doesn't exist. Would you like to try another one?");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }


}