package com.zrh.maven.mapper;

import com.zrh.maven.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    List<User> getUsers();
}
