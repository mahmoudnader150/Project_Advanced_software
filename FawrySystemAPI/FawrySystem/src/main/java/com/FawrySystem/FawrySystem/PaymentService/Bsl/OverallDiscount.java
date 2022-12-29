package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProvider;

import java.util.HashMap;

public class OverallDiscount extends Discount {
    public OverallDiscount(ServiceProvider ServiceProvider) {
        super(ServiceProvider);
    }

    @Override
    public boolean handleInput(HashMap<String, Object> Data) {
        return this.serviceProvider.handleInput(Data);
    }

    @Override
    public double getCost() {
        double overallCost = serviceProvider.getCost();

        double newCost = (overallCost-(0.1*overallCost));

        return newCost;
    }
}
