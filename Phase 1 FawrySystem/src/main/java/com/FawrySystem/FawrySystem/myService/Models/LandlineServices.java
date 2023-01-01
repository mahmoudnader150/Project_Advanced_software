package com.FawrySystem.FawrySystem.myService.Models;

public class LandlineServices extends Service{
    public LandlineServices(double cost, String description) {
        this.cost = cost;
        this.description = description;
        this.fees = 2.1;
        this.state = false;
    }
    @Override
    public double getCost() {
        return cost+fees;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
