package com.FawrySystem.FawrySystem.PaymentService.Model;


import java.util.HashMap;

public abstract class ServiceProvider {
    public String name;
    public double fees, amount = 0;
    public boolean state;

    public double getFees() {
        return fees;
    }
    public ServiceProvider(){}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public ServiceProvider(String name){
        this.name=name;
        this.fees = 5;
    }
    abstract public boolean handleInput(HashMap<String,Object> Data);

    public abstract double getCost();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
