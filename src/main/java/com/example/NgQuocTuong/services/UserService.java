package com.example.NgQuocTuong.services;

import com.example.NgQuocTuong.entity.User;
import com.example.NgQuocTuong.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;
    public void save(User user){ userRepository.save(user);}

    public User getUserByUsername(String name){
        return userRepository.findByUsername(name);
    }

}
