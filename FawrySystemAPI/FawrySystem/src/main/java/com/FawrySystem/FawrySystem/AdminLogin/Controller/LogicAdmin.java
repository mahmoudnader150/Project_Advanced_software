package com.FawrySystem.FawrySystem.AdminLogin.Controller;

import com.FawrySystem.FawrySystem.AdminLogin.Model.Admin;
import com.FawrySystem.FawrySystem.AdminLogin.Bsl.AdminBsl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class LogicAdmin {

    @Autowired
    private AdminBsl adminBsl;

    @PostMapping(value = "/signin")
    public String checkAccount(@RequestBody Admin c) {
        return adminBsl.checkAccount(c);
    }

}
