package com.example.NgQuocTuong.repository;

import com.example.NgQuocTuong.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.username=?1")
    User findByUsername(String username);
}
