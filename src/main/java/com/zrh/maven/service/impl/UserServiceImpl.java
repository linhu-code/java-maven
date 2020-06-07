package com.zrh.maven.service.impl;

import com.zrh.maven.domain.User;
import com.zrh.maven.entity.vo.UserVo;
import com.zrh.maven.mapper.UserMapper;
import com.zrh.maven.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        List<User> list = userMapper.getUsers();
        return list;
    }

    public int addUser(UserVo userVo) {
        int res = userMapper.addUser(userVo);
        return res;
    }
}
