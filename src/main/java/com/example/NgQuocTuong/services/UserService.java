package com.example.NgQuocTuong.services;

import com.example.NgQuocTuong.entity.User;
import com.example.NgQuocTuong.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

//    @Autowired
//    private IRoleRepository roleRepository;
    public void save(User user){ userRepository.save(user);}

    public User getUserByUsername(String name){
        return userRepository.findByUsername(name);
    }


//    Long userId = userRepository.getUserIdByUsername(user.getUsername());
//    Long roleId = roleRepository.getRoleByName("USER");
//    if(roleId != 0 && userId !=0 ){
//        userRepository.addRoleToUser(userId,roleId)
//    }
}
