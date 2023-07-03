package com.osiki.Ecommerceapp.controller;

import com.osiki.Ecommerceapp.dto.AdminDto;
import com.osiki.Ecommerceapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/register")
    public String getAdminRegisterPage(Model model){
        AdminDto adminDto = new AdminDto();

        model.addAttribute("adminRegisterRequest", adminDto);
        return "admin_register_page";

    }
}
