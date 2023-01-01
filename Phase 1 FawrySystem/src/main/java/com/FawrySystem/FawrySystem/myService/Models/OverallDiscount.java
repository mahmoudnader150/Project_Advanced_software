package com.FawrySystem.FawrySystem.myService.Models;

public class OverallDiscount extends Discount{
    public OverallDiscount(Service service) {
        super(service);
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public void setPercent(Double percent){
        this.percent = percent;
    }

    @Override
    public double getCost() {
        double overallCost = service.getCost();
        String.format("%.5f", overallCost);
        return (overallCost-(0.1*overallCost));
    }
}
