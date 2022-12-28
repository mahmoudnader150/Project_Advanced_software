package com.FawrySystem.FawrySystem.PaymentService.Bsl;


import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProviderFactory;

public abstract class Discount extends ServiceProviderFactory {
    protected double percent;
    public ServiceProviderFactory serviceProviderFactory;

    public Discount(ServiceProviderFactory serviceProviderFactory) {
        serviceProviderFactory.setState(true);
        this.serviceProviderFactory = serviceProviderFactory;
    }


    public double getCost(){

        return serviceProviderFactory.getCost();
    }

    public Double getPercent() {
        return this.getCost();
    }

//    abstract public void setPercent(Double percent);
}
