package com.FawrySystem.FawrySystem.myService.myServiceBsl;

import com.FawrySystem.FawrySystem.Models.CashPayment;
import com.FawrySystem.FawrySystem.Models.CreditCardPayment;
import com.FawrySystem.FawrySystem.Models.Payment;
import com.FawrySystem.FawrySystem.myService.Models.*;

import static com.FawrySystem.FawrySystem.Customer.LoginController.currentCustomer;

public class DiscountLogic {
    public Service setSpecificDiscount(Service service) { //the system will add overall discount if it's the first time for that customer to do payment
        service = new SpecificDiscount(service);
        return service;
    }
    public Service setOverallDiscount(Service service) {
        currentCustomer.setfTime(true);
        service = new OverallDiscount(service);
        return service;
    }
    public Payment setPaymentMethod(int choice) { // setting payment method for the customer
        if (choice == 1) {
            return new CreditCardPayment();
        } else {
            return new CashPayment();
        }
    }
}
