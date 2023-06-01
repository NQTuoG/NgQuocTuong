package com.example.NgQuocTuong.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;


@Data
@Entity
@Table(name="NHANVIEN")
public class NhanVien {
    @Id
    @Column(name = "MaNV")
    @NotEmpty(message = "MaNV must not be empty")
    @Size(max = 3, message = "MaNV must be less than 3 characters")
    private String Ma_NV;

    @Column(name = "TenNV")
    @NotEmpty(message = "Ten NV must not be empty")
    @Size(max = 100,min = 1,message = "TenNV must be less than 100 characters")
    private String Ten_NV;

    @Column(name = "Phai")
    @Size(max = 3,min = 1,message = "Phai must be less than 3 characters")
    private String Phai;

    @Column(name = "NoiSinh")
    @Size(max = 100,min = 1,message = "Noi sinh must be less than 100 characters")
    private String Noi_Sinh;

    @Column(name = "Luong")
    private int Luong;

    @ManyToOne
    @JoinColumn(name = "Ma_Phong")

    private PhongBan PhongBan;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")

    private User user;
}
