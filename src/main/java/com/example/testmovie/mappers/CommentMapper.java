package com.example.testmovie.mappers;

import com.example.testmovie.DAO.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper extends ObjMapper<Comment> {
}
