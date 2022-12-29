package com.FawrySystem.FawrySystem.RefundRequest.Model;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;

public class RefundRequest {
    public boolean state;
    public String transactionName;
    double amount;

    public RefundRequest(String transactionName, double amount) {
        this.transactionName = transactionName;
        this.amount = amount;
        state = false;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isState() {
        return state;
    }

    public void update(Customer currentCustomer, boolean state) {
        this.state = state;
        if(state==true){
            currentCustomer.getWallet().setAmount(this.amount);
        }
    }
}
