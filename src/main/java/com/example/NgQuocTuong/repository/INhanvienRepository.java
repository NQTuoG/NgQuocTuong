package com.example.NgQuocTuong.repository;

import com.example.NgQuocTuong.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanvienRepository extends JpaRepository<NhanVien,String> {
}
