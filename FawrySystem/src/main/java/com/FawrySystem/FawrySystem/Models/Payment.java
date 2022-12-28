package com.FawrySystem.FawrySystem.Models;

import com.FawrySystem.FawrySystem.myService.Models.Discount;
import com.FawrySystem.FawrySystem.myService.Models.Service;

public abstract class Payment {
    public Service service;
    public Discount discount;

    public abstract void pay(double amount);

    /*confirm method for payment process*/
    abstract Boolean confirmPayment();

    abstract Boolean checkAmount();
}
