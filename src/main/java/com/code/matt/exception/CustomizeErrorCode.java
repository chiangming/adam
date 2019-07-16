package com.code.matt.exception;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午4:05
 * @Description:
 * @Modified: By
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"The problem you're looking for doesn't exist. Would you like to try another one?"),
    TARGET_PARAM_NOT_FOUND(2002, "No questions or comments were selected to respond"),
    NO_LOGIN(2003, "The current operation requires login. Please try again after login."),
    SYS_ERROR(2004, "There is something wrong with the service, you can try again later!"),
    TYPE_PARAM_WRONG(2005, "Comment type error or nonexistence"),
    COMMENT_NOT_FOUND(2006, "The comments in the reply do not exist. Would you like to try another one?"),
    CONTENT_IS_EMPTY(2007, "Input cannot be empty"),
    READ_NOTIFICATION_FAIL(2008, "Fail to get notification"),
    NOTIFICATION_NOT_FOUND(2009, "Notification not found"),
    FILE_UPLOAD_FAIL(2010, "Fail to upload picture"),;;

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public Integer getCode() { return code; }

    @Override
    public String getMessage() {
        return message;
    }
}