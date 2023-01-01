package com.FawrySystem.FawrySystem.myService.Models;

public class InternetPayment extends Service{
    public InternetPayment(double cost, String description) {
        this.cost = cost;
        this.description = description;
        this.fees = 3.0;
    }

    @Override
    public double getCost() {
        return cost+fees;
    }

    public String getDescription() {
        return super.getDescription();
    }
}
