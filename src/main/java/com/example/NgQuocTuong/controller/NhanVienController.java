package com.example.NgQuocTuong.controller;

import com.example.NgQuocTuong.entity.NhanVien;
import com.example.NgQuocTuong.services.NhanVienService;
import com.example.NgQuocTuong.services.PhongBanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanviens")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanvienService;
    @Autowired
    private PhongBanService phongbanService;
    @GetMapping
    public String showAllNhanVien(Model model){
        List<NhanVien> NhanViens = nhanvienService.getAllNhanVien();
        model.addAttribute("nhanviens", NhanViens);
        return "nhanvien/list";
    }
    @GetMapping("/add")
    public String addNhanVienForm(Model model){
        model.addAttribute("nhanvien",new NhanVien());
        model.addAttribute("PhongBans", phongbanService.getAllPhongBan());
        return "nhanvien/add";
    }
    @PostMapping("/add")
    public String addNhanVien(@Valid @ModelAttribute("nhanvien") NhanVien nhanVien, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("PhongBans", phongbanService.getAllPhongBan());
            return "nhanvien/add";
        }
        nhanvienService.addNhanVien(nhanVien);
        return "redirect:/nhanviens";
    }

    @GetMapping("edit/{id}")
    public String editNhanVienForm(@PathVariable("id")String id, Model model){
        NhanVien editNhanVien = nhanvienService.getNhanVienId(id);
        if (editNhanVien != null ){
            model.addAttribute("nhanvien",editNhanVien);
            model.addAttribute("PhongBans", phongbanService.getAllPhongBan());
            return "nhanvien/edit";
        }else {
            return "redirect:/nhanviens";
        }
    }

    @PostMapping("edit/{id}")
    public String editNhanVien(@PathVariable("id")String id, @ModelAttribute("nhanvien") @Valid NhanVien editNhanVien, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("PhongBans", phongbanService.getAllPhongBan());
            return "nhanvien/edit";
        }else {
            NhanVien existingNhanVien = nhanvienService.getNhanVienId(id);
            if ( existingNhanVien != null){
                existingNhanVien.setTen_NV(editNhanVien.getTen_NV());
                existingNhanVien.setPhai(editNhanVien.getPhai());
                existingNhanVien.setNoi_Sinh(editNhanVien.getNoi_Sinh());
                existingNhanVien.setLuong(editNhanVien.getLuong());
                existingNhanVien.setPhongBan((editNhanVien.getPhongBan()));
                nhanvienService.updateNhanVien(existingNhanVien);
            }
            return "redirect:/nhanviens";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable("id") String id){
        nhanvienService.deleteNhanVien(id);
        return "redirect:/nhanviens";
    }


}
