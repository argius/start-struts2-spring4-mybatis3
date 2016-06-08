package net.argius.myapp.models;

import java.util.List;
import org.apache.ibatis.annotations.*;

public interface UserMapper {

    @Select("select id, name, age from users")
    @Results(value={
            @Result(column="id", property="id"),
            @Result(column="name", property="name"),
            @Result(column="age", property="age")
    })
    List<User> getAllUsers();

}