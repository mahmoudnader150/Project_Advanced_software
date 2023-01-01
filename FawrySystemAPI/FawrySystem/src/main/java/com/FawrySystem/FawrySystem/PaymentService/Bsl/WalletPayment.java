package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;

public class WalletPayment extends Payment{
    Customer customer;

    public WalletPayment(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String pay(double amount) {
        if(amount >= customer.getWallet().getAmount())
        {
            customer.getWallet().setAmount(-amount);
            return amount + " Paid with wallet";
        }
        else {
            return "No sufficient amount";
        }
    }

}
