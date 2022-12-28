package com.FawrySystem.FawrySystem.PaymentService.Bsl;



public abstract class Payment {
    public Discount discount;

    public abstract String  pay(double amount);

}
