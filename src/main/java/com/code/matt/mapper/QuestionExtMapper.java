package com.code.matt.mapper;

import com.code.matt.model.Question;

import java.util.List;

/**
 * @Author: ming
 * @Date: Created in    19-7-15 下午5:33
 * @Description:
 * @Modified: By
 */
public interface QuestionExtMapper {
    int updateByIncreaseViewCount(Question record);

    void updateByIncreaseCommentCount(Question question);

    List<Question> selectRelated(Question question);
}
