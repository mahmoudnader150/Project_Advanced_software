package com.FawrySystem.FawrySystem.PaymentService.Bsl;
import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProviderFactory;
import java.util.HashMap;

public class SpecificDiscount extends Discount {


    public SpecificDiscount(ServiceProviderFactory serviceProviderFactory) {
        super(serviceProviderFactory);
    }

    @Override
    public boolean handleInput(HashMap<String, Object> Data) {
        return serviceProviderFactory.handleInput(Data);
    }

    @Override
    public double getCost() {
        double overallCost = serviceProviderFactory.getCost();
        return overallCost - (0.3 * overallCost);
    }
}
