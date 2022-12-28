package com.FawrySystem.FawrySystem.PaymentService.Bsl;

public class CashPayment extends Payment {
    public Double amount;
    @Override
    public String  pay(double amount) {
        return (amount+" Paid cash");
    }

}
