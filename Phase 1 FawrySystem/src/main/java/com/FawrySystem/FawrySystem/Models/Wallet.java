package com.FawrySystem.FawrySystem.Models;

public class Wallet {
    public double amount;

    public Wallet() {
        this.amount = 0;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public double getAmount() {
        return amount;
    }
}
