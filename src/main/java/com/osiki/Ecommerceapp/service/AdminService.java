package com.osiki.Ecommerceapp.service;

import com.osiki.Ecommerceapp.dto.AdminAuthentication;
import com.osiki.Ecommerceapp.dto.AdminDto;
import com.osiki.Ecommerceapp.model.Admin;

public interface AdminService {
    AdminDto registerAdmin(AdminDto adminDto);

    Admin loginAdmin(AdminAuthentication adminAuthentication);
}
