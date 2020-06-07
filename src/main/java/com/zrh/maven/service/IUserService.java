package com.zrh.maven.service;

import com.zrh.maven.domain.User;
import com.zrh.maven.entity.vo.UserVo;

import java.util.List;

public interface IUserService {
    List<User> getUsers();

    int addUser(UserVo userVo);
}
