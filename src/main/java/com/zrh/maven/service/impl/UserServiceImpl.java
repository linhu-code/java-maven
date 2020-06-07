package com.zrh.maven.service.impl;

import com.zrh.maven.domain.User;
import com.zrh.maven.mapper.UserMapper;
import com.zrh.maven.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {


    private final UserMapper userMapper;


    public List<User> getUsers() {
        List<User> list = userMapper.getUsers();
        return list;
    }
}
