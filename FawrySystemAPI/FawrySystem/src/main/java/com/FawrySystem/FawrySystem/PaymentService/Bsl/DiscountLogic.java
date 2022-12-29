package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProvider;

//import static com.FawrySystem.FawrySystem.CustomerLogin.Controller.LoginController.currentCustomer;

public class DiscountLogic {
    public ServiceProvider setSpecificDiscount(ServiceProvider myService) { //the system will add overall discount if it's the first time for that customer to do payment
        myService = new SpecificDiscount(myService);
        return myService;
    }
    public ServiceProvider setOverallDiscount(Customer currentCustomer, ServiceProvider myService) {
        currentCustomer.setfTime(true);
        myService = new OverallDiscount(myService);
        return myService;
    }

}
