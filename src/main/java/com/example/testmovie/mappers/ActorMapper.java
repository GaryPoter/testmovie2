package com.example.testmovie.mappers;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.utils.ConditionalObj;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ActorMapper extends ObjMapper<Actor>{
}
