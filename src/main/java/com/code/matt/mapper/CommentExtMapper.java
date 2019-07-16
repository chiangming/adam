package com.code.matt.mapper;

import com.code.matt.model.Comment;

/**
 * @Author: ming
 * @Date: Created in    19-7-16 下午3:05
 * @Description:
 * @Modified: By
 */
public interface CommentExtMapper {
    int updateByIncreaseCommentCount(Comment comment);
}