package com.zrh.maven.controller;

import com.zrh.maven.domain.User;
import com.zrh.maven.entity.vo.UserVo;
import com.zrh.maven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService iUserService;


    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> list = iUserService.getUsers();
        return list;
    }

    @PostMapping("/addUser")
    public int addUser(@RequestBody UserVo userVo) {
        return iUserService.addUser(userVo);
    }
}
