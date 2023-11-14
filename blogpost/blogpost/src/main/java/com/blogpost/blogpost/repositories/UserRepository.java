package com.blogpost.blogpost.repositories;

import com.blogpost.blogpost.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
   // void delete(Optional<User> u);
}
