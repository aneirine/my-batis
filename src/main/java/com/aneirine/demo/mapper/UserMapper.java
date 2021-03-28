package com.aneirine.demo.mapper;

import com.aneirine.demo.models.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAll();

    @Insert("insert into users (name, salary) values (#{name}, #{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(User data);

    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUserById(@Param("id") int id);
}
