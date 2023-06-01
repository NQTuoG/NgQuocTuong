package com.example.NgQuocTuong.services;

import com.example.NgQuocTuong.entity.NhanVien;
import com.example.NgQuocTuong.repository.INhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private INhanvienRepository nhanvienRepository;
    public List<NhanVien> getAllNhanVien(){
        return nhanvienRepository.findAll();
    }
    public NhanVien getNhanVienId(String MaNV){
        return nhanvienRepository.findById(MaNV).orElse(null);
    }
    public void addNhanVien(NhanVien nhanvien){
        nhanvienRepository.save(nhanvien);
    }
    public void deleteNhanVien(String MaNV){
        nhanvienRepository.deleteById(MaNV);
    }
    public void updateNhanVien(NhanVien nhanvien){
        nhanvienRepository.save(nhanvien);
    }
}
