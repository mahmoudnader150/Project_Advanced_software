package com.FawrySystem.FawrySystem.CustomerLogin.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Bsl.LoginBsl;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController //return Data
@RequestMapping("/customer")
public class LoginController {

    @Autowired
    LoginBsl loginBsl;

    @PostMapping(value = "/signin")
    public String checkAccount(@RequestBody Customer c){
        return loginBsl.checkAccount(c);
    }

    @PostMapping(value = "/signup")
    public String addAccount(@RequestBody Customer c){ //This function is used to check if the customer has account or not
        return loginBsl.addAccount(c);
    }

    public Customer getAccount(String userName)
    {
        return loginBsl.getAccount(userName);
    }
}
