package com.zyx.libsys.dao;

import com.zyx.libsys.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from users where user_id = #{user_id} and password = #{password}")
    public Users login(Integer user_id, String password);
}
