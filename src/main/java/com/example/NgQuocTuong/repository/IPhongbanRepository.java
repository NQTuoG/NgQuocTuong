package com.example.NgQuocTuong.repository;

import com.example.NgQuocTuong.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongbanRepository extends JpaRepository<PhongBan,String> {
}
