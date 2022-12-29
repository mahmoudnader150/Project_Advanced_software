package com.FawrySystem.FawrySystem.PaymentService.Bsl;
import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProvider;
import java.util.HashMap;

public class SpecificDiscount extends Discount {


    public SpecificDiscount(ServiceProvider serviceProvider) {
        super(serviceProvider);
    }

    @Override
    public boolean handleInput(HashMap<String, Object> Data) {
        return serviceProvider.handleInput(Data);
    }

    @Override
    public double getCost() {
        double overallCost = serviceProvider.getCost();
        return overallCost - (0.3 * overallCost);
    }
}
