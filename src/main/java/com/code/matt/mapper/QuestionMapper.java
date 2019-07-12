package com.code.matt.mapper;

import com.code.matt.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: ming
 * @Date: Created in    19-7-12 下午7:46
 * @Description:
 * @Modified: By
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,gmt_create,gmt_modify,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
}
