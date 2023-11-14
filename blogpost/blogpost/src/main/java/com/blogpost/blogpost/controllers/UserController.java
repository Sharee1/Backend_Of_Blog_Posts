package com.blogpost.blogpost.controllers;


import com.blogpost.blogpost.payloads.UserDto;
import com.blogpost.blogpost.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){

        UserDto createDto=this.userService.createUser(userDto);
        return  new ResponseEntity<>(createDto, HttpStatus.CREATED);
    }



}
