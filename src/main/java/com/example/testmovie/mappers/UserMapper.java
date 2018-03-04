package com.example.testmovie.mappers;

import com.example.testmovie.DAO.User;
import com.example.testmovie.utils.Table;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.Map;

@Mapper
public interface UserMapper extends ObjMapper<User>{

//    @SelectProvider(type = DynaSqlProvider.class, method = "selectWithParam")
//    ArrayList<User> serchAll(Table table);
//
//    @Select("SELECT * FROM USER WHERE ID = #{id}")
//    User getUserById(@Param("id") Long id);
//
//    @Select("SELECT * FROM USER WHERE ID = #{id} OR NAME = #{name}")
//    User getUser(User user);
//
//    @Select("SELECT * FROM USER WHERE NAME = #{name} AND PASWD = #{paswd}")
//    User getUserByNameAndPaswd(User user);
//
//    @Insert("INSERT INTO USER(name, paswd) VALUES (#{name}, #{paswd})")
//    int addUser(User user);
////    @InsertProvider(type = DynaSqlProvider.class, method =  "insertWithParam")
////    int addUser(Table table);
//
//    @Delete("DELETE FROM USER WHERE ID = #{id}")
//    int deleteUser(User user);
////    @DeleteProvider(type = DynaSqlProvider.class, method = "deleteWithParam")
////    int deleteUser(Table table);
//
//    @Update("UPDATE USER SET name=#{name}, paswd=#{paswd} WHERE ID = #{id}")
//    int updateUser(User user);
//    @UpdateProvider(type = DynaSqlProvider.class, method = "updateWithParam")
//    int updateUser(Table table);
    @Select("select user.name , movie.name, comment.content from user, movie, comment where user.id = comment.user_id and movie.id = comment.movie_id")
    Object getAllComment();
}
