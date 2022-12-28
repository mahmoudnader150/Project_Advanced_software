package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProviderFactory;

import java.util.HashMap;

public class OverallDiscount extends Discount {
    public OverallDiscount(ServiceProviderFactory ServiceProviderFactory) {
        super(ServiceProviderFactory);
    }

    @Override
    public boolean handleInput(HashMap<String, Object> Data) {
        return this.serviceProviderFactory.handleInput(Data);
    }

    @Override
    public double getCost() {
        double overallCost = serviceProviderFactory.getCost();

        double newCost = (overallCost-(0.1*overallCost));

        return newCost;
    }
}
