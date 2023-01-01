package com.FawrySystem.FawrySystem.myService.Controllers;

import com.FawrySystem.FawrySystem.Customer.LoginController;
import com.FawrySystem.FawrySystem.myService.Models.*;
import com.FawrySystem.FawrySystem.myService.myServiceBsl.ServiceLogic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/login")
public class CustomerService {
    LoginController loginController;
//    public CustomerService()
//    {
//        services.add(new LandlineServices(5.50,"landline"));
//        services.add(new MobilRecharge(60.7,"Mobil recharge"));
//        services.add(new InternetPayment(80.5, "Internet payment"));
//        services.add(new Donations(100.5, "Donations"));
//
//    }

    @PostMapping(value = "/service")
    public void showServices(@RequestBody String serviceName, String serviceProvider, int choice, double amount) {                //this function show all service to the customer
        ServiceLogic showService = new ServiceLogic();
        showService.doPayment(serviceName, serviceProvider, choice, amount);
    }
}
