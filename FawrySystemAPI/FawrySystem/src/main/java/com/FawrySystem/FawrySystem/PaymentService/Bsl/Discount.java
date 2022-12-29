package com.FawrySystem.FawrySystem.PaymentService.Bsl;


import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProvider;

public abstract class Discount extends ServiceProvider {
    public ServiceProvider serviceProvider;

    public Discount(ServiceProvider serviceProvider) {
        serviceProvider.setState(true);
        this.serviceProvider = serviceProvider;
    }


    public double getCost(){

        return serviceProvider.getCost();
    }

}
