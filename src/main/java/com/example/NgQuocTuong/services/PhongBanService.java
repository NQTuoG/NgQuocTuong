package com.example.NgQuocTuong.services;

import com.example.NgQuocTuong.entity.PhongBan;
import com.example.NgQuocTuong.repository.IPhongbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanService {
    @Autowired
    private IPhongbanRepository phongbanRepository;
    public List<PhongBan> getAllPhongBan(){ return phongbanRepository.findAll();}
    public PhongBan getPhongBanById(String id){return phongbanRepository.findById(id).orElse(null);}
    public PhongBan savePhongBan(PhongBan phongban) { return phongbanRepository.save(phongban);}
    public void deletePhongBan(String id){ phongbanRepository.deleteById(id);}

}
