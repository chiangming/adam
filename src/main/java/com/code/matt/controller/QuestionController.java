package com.code.matt.controller;

import com.code.matt.dto.QuestionDTO;
import com.code.matt.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 上午9:45
 * @Description:
 * @Modified: By
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model) {
        QuestionDTO questionDTO = questionService.getById(id);

        //increase view count
        questionService.incView(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
