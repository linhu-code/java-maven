package com.zrh.maven.mapper;

import com.zrh.maven.domain.User;
import com.zrh.maven.entity.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUsers();

    int addUser(UserVo userVo);
}
