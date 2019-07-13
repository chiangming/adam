package com.code.matt.service;

import com.code.matt.dto.PaginationDTO;
import com.code.matt.dto.QuestionDTO;
import com.code.matt.mapper.QuestionMapper;
import com.code.matt.mapper.UserMapper;
import com.code.matt.model.Question;
import com.code.matt.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ming
 * @Date: Created in    19-7-12 下午11:33
 * @Description:
 * @Modified: By
 */

@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public PaginationDTO List(Integer page, Integer size) {
        PaginationDTO paginationDTO = new PaginationDTO();
        Integer totalCount = questionMapper.count();
        paginationDTO.setPagination(totalCount, page, size);

        Integer totalPage = paginationDTO.getTotalPage();
        page = (page < 1) ? 1 : (page > totalPage) ? totalPage : page;

        Integer offset = size * (page - 1);

        List<Question> questions = questionMapper.List(offset, size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();


        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);


        return paginationDTO;
    }
}
