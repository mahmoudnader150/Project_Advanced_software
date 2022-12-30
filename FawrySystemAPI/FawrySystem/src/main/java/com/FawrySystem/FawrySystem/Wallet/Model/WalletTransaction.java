package com.FawrySystem.FawrySystem.Wallet.Model;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;

public class WalletTransaction {
    double addedAmount;
    Customer customer;

    public WalletTransaction(Customer customer, double addedAmount) {
        this.customer = customer;
        this.addedAmount = addedAmount;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAddedAmount() {
        return addedAmount;
    }

    public void setAddedAmount(double addedAmount) {
        this.addedAmount = addedAmount;
    }

}
