package com.zrh.maven.controller;

import com.zrh.maven.domain.User;
import com.zrh.maven.mapper.UserMapper;
import com.zrh.maven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private IUserService iUserService;


    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> list = iUserService.getUsers();
        return list;
    }
}
