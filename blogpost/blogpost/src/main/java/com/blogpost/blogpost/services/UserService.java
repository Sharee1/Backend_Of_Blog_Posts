package com.blogpost.blogpost.services;

import com.blogpost.blogpost.payloads.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDto createUser(UserDto user);
    UserDto updateUSer(UserDto user,Integer UserId);
    UserDto getUSerbyId(Integer UserId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);


}
