package com.code.matt.advice;

import com.code.matt.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午4:00
 * @Description:
 * @Modified: By
 */
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e, Model model) {
        if (e instanceof CustomizeException) {
            model.addAttribute("message", e.getMessage());
        } else {
            model.addAttribute("message", "Something wrong with the service, you can try again later!");
        }
        return new ModelAndView("error");
    }
}
