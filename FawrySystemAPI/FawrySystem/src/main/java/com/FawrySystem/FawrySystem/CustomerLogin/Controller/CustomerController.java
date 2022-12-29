package com.FawrySystem.FawrySystem.CustomerLogin.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Bsl.CustomerBsl;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //return Data
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerBsl customerBsl;

    @PostMapping(value = "/signin")
    public String checkAccount(@RequestBody Customer c){
        return customerBsl.checkAccount(c);
    }

    @PostMapping(value = "/signup")
    public String addAccount(@RequestBody Customer c){ //This function is used to check if the customer has account or not
        return customerBsl.addAccount(c);
    }

    public Customer getAccount(String userName)
    {
        return customerBsl.getAccount(userName);
    }
}
