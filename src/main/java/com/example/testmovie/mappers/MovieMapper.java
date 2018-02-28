package com.example.testmovie.mappers;

import com.example.testmovie.DAO.Movie;
import com.example.testmovie.utils.JDBCStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface MovieMapper extends ObjMapper<Movie>{
}
