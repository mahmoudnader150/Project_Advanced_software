package com.FawrySystem.FawrySystem.CustomerLogin.Model;

public class Wallet {
    public double amount;

    public Wallet() {
        this.amount = 0;
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }

    public double getAmount() {
        return amount;
    }
}
