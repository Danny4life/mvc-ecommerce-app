package com.osiki.Ecommerceapp.service.impl;

import com.osiki.Ecommerceapp.repository.AdminRepository;
import com.osiki.Ecommerceapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
}
