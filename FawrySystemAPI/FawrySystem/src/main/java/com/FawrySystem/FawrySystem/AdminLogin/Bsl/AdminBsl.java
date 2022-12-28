package com.FawrySystem.FawrySystem.AdminLogin.Bsl;

import com.FawrySystem.FawrySystem.AdminLogin.Model.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminBsl { //SUBJECT
    public static Admin admin = new Admin("hassan", "0000", "h@3");


    public String checkAccount(Admin c) {
        if (admin.getEmail().equals(c.getEmail()) &&
                admin.getPassword().equals(c.getPassword()) &&
                admin.getUserName().equals(c.getUserName())) {
            return "Successfully login";
        }
        return "login failed";
    }
}
