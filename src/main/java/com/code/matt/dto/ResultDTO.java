package com.code.matt.dto;

import com.code.matt.exception.CustomizeErrorCode;
import com.code.matt.exception.CustomizeException;
import lombok.Data;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午8:19
 * @Description:
 * @Modified: By
 */
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code, String message) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(), errorCode.getMessage());
    }

    public static ResultDTO errorOf(CustomizeException e) {
        return errorOf(e.getCode(), e.getMessage());
    }

    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("Successful request");
        return resultDTO;
    }
}