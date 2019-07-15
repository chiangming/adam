package com.code.matt.service;

import com.code.matt.dto.PaginationDTO;
import com.code.matt.dto.QuestionDTO;
import com.code.matt.mapper.QuestionMapper;
import com.code.matt.mapper.UserMapper;
import com.code.matt.model.Question;
import com.code.matt.model.QuestionExample;
import com.code.matt.model.User;
import org.apache.ibatis.session.RowBounds;
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
        Integer totalCount = (int) questionMapper.countByExample(new QuestionExample());


        int a = totalCount;
        int b = size;
        Integer totalPage = (int) Math.ceil(a / (double) b);
        page = (page < 1) ? 1 : (page > totalPage) ? totalPage : page;
        paginationDTO.setPagination(totalPage, page);

        Integer offset = size * (page - 1);

        List<Question> questions = questionMapper.selectByExampleWithRowbounds(new QuestionExample(), new RowBounds(offset, size));
        List<QuestionDTO> questionDTOList = new ArrayList<>();


        for (Question question : questions) {
            User user = userMapper.selectByPrimaryKey(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);


        return paginationDTO;
    }

    public PaginationDTO list(Integer userId, Integer page, Integer size) {
        PaginationDTO paginationDTO = new PaginationDTO();
        QuestionExample questionExample = new QuestionExample();
        questionExample.createCriteria()
                .andCreatorEqualTo(userId);
        Integer totalCount = (int) questionMapper.countByExample(questionExample);

        int a = totalCount;
        int b = size;
        Integer totalPage = (int) Math.ceil(a / (double) b);
        page = (page < 1) ? 1 : (page > totalPage) ? totalPage : page;
        paginationDTO.setPagination(totalPage, page);

        Integer offset = size * (page - 1);

        QuestionExample example = new QuestionExample();
        example.createCriteria()
                .andCreatorEqualTo(userId);
        List<Question> questions = questionMapper.selectByExampleWithRowbounds(example, new RowBounds(offset, size));
        List<QuestionDTO> questionDTOList = new ArrayList<>();


        for (Question question : questions) {
            User user = userMapper.selectByPrimaryKey(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);


        return paginationDTO;
    }

    public QuestionDTO getById(Integer id) {
        Question question = questionMapper.selectByPrimaryKey(id);
        QuestionDTO questionDTO = new QuestionDTO();
        BeanUtils.copyProperties(question, questionDTO);
        User user = userMapper.selectByPrimaryKey(question.getCreator());
        questionDTO.setUser(user);
        return questionDTO;
    }


    public void createOrUpdate(Question question) {
        if (question.getId() == null) {
            // 创建
            question.setGmtCreate(System.currentTimeMillis());
            question.setGmtModify(question.getGmtCreate());
            questionMapper.insert(question);
        } else {
            // 更新
            Question updateQuestion = new Question();
            updateQuestion.setGmtModify(System.currentTimeMillis());
            updateQuestion.setTitle(question.getTitle());
            updateQuestion.setDescription(question.getDescription());
            updateQuestion.setTag(question.getTag());
            QuestionExample example = new QuestionExample();
            example.createCriteria()
                    .andIdEqualTo(question.getId());
            questionMapper.updateByExampleSelective(updateQuestion, example);
        }
    }
}
