package com.FawrySystem.FawrySystem.myService.Models;

import com.FawrySystem.FawrySystem.Models.Payment;

public abstract class Service {
    double cost;
    String description;
    boolean state;
    double fees;
    public void pay(Payment payment){ //for nowwwwwwwwwwwwwwwwwwwwwwwwww
        payment.pay(this.getCost());
    }

    public void setCost(double cost) {
        this.cost = cost+fees;
    }

    public abstract double getCost() ;

    public String getDescription(){
        return this.description;
    }

    public Boolean hasDiscount(){return this.state;}

    void setDiscount(Boolean state){
        this.state = state;
    }
}
