package com.FawrySystem.FawrySystem.PaymentService.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Controller.CustomerController;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.PaymentService.Bsl.PaymentBsl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/service")
public class PaymentConroller {
    @Autowired
    PaymentBsl paymentBsl;
    @Autowired
    CustomerController customerController;

    @PostMapping(value = "/{userName}/getcost")
    public String getCost(@PathVariable String userName, @RequestBody HashMap<String, Object> Data){
        Customer currentCustomer = customerController.getAccount(userName);
        return paymentBsl.getCost(currentCustomer,Data);
    }
    @PostMapping(value = "/{userName}/pay/{choice}/{amount}")
    public String doPayment(@PathVariable String userName, @PathVariable String choice, @PathVariable double amount){
        Customer currentCustomer = customerController.getAccount(userName);
        return paymentBsl.pay(currentCustomer,choice, amount);
    }
}
