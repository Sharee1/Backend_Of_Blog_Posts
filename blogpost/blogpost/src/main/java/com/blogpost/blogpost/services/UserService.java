package com.blogpost.blogpost.services;

import com.blogpost.blogpost.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    UserDto updateUSer(UserDto user,Integer UserId);
    UserDto getUSerbyId(Integer UserId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);


}
