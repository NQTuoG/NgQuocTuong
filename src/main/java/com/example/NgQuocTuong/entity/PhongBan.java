package com.example.NgQuocTuong.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "PHONGBAN")
public class PhongBan {
    @Id
    @Column(name = "MaPhong")
    @Size(max = 2, min = 1, message = "MaPB must be less than 2 characters")
    private String Ma_Phong;

    @Column(name = "TenPhong")
    @Size(max = 30, min = 1, message = "TenPB must be less than 30 characters")
    private String Ten_Phong;

    @OneToMany(mappedBy = "PhongBan",cascade = CascadeType.ALL)
    private List<NhanVien> Nhanvien;
}
