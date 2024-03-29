package com.code.matt.controller;

import com.code.matt.cache.TagCache;
import com.code.matt.dto.QuestionDTO;
import com.code.matt.model.Question;
import com.code.matt.model.User;
import com.code.matt.service.QuestionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ming
 * @Date: Created in    19-7-12 下午6:34
 * @Description:
 * @Modified: By
 */
@Controller
public class PublishController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/publish/{id}")
    public String edit(@PathVariable(name = "id") Long id,
                       Model model) {
        QuestionDTO question = questionService.getById(id);
        model.addAttribute("title", question.getTitle());
        model.addAttribute("description", question.getDescription());
        model.addAttribute("tag", question.getTag());
        model.addAttribute("id", question.getId());
        model.addAttribute("tags", TagCache.get());
        return "publish";
    }

    @GetMapping("/publish")
    public String publish(Model model) {
        model.addAttribute("tags", TagCache.get());
        return "publish";
    }

    @PostMapping("/publish")
    public String doPublish(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "description", required = false) String description,
            @RequestParam(value = "tag", required = false) String tag,
            @RequestParam(value = "id", required = false) Long id,
            HttpServletRequest request,
            Model model) {

        model.addAttribute("title", title);
        model.addAttribute("description", description);
        model.addAttribute("tag", tag);
        model.addAttribute("tags", TagCache.get());

        if (title == null || title == "") {
            model.addAttribute("error", "Error: The title should not be blank!");
            return "publish";
        }

        if (description == null || description == "") {
            model.addAttribute("error", "Error: The description should not be blank!");
            return "publish";
        }

        if (tag == null || tag == "") {
            model.addAttribute("error", "Error: The tag should not be blank!");
            return "publish";
        }

        /*String invalid = TagCache.filterInvalid(tag);
        if (StringUtils.isNotBlank(invalid)) {
            model.addAttribute("error", "Illegal labels:" + invalid);
            return "publish";
        }*/

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            model.addAttribute("error", "Error: Unlogged User!");
            return "publish";
        }

        Question question = new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        question.setCreator(user.getId());
        question.setId(id);
        questionService.createOrUpdate(question);


        return "redirect:/";
    }
}
