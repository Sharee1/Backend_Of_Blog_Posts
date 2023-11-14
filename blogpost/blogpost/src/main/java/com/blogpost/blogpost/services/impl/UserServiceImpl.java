package com.blogpost.blogpost.services.impl;

import com.blogpost.blogpost.entity.User;
import com.blogpost.blogpost.exception.ResourceNotFoundException;
import com.blogpost.blogpost.payloads.UserDto;
import com.blogpost.blogpost.repositories.UserRepository;
import com.blogpost.blogpost.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = this.dtoToUser(userDto);

        this.userRepository.save(user);
        return null;
    }

    @Override
    public UserDto updateUSer(UserDto userDto, Integer UserId) {

     User user=this.userRepository.findById(UserId).orElseThrow();
     user.setName(userDto.getName());
     user.setEmail(userDto.getEmail());
     user.setPassword(userDto.getPassword());
     user.setAbout(user.getAbout());
     user.setId(user.getId());
     User updateduser=this.userRepository.save(user);

        UserDto userDto1 = this.userDto(updateduser);
        return userDto1;

    }

    @Override
    public UserDto getUSerbyId(Integer UserId) {
        User user = this.userRepository.getById(UserId);
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<User> users = this.userRepository.findAll();
      List<UserDto> userDtos= users.stream().map(user->this.userDto(user)).collect(Collectors.toList());


        return userDtos;
    }

    @Override
    public void deleteUser(Integer userId) {

//       Optional<User> user= this.userRepository.findById(userId);
//       this.userRepository.delete(user);

    }

    private User dtoToUser(UserDto userDto) {

        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        return user;}

    private UserDto userDto(User user){

        UserDto userDto=new UserDto();
        userDto.setId(userDto.getId());
        userDto.setName(user.getName());
        userDto.setPassword(userDto.getPassword());
        userDto.setEmail(userDto.getEmail());
        userDto.setAbout(userDto.getAbout());

        return   userDto;
    }


}
