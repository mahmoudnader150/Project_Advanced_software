package com.FawrySystem.FawrySystem.PaymentService.Model;

import java.util.HashMap;

public class VodafoneInternet extends ServiceProviderFactory{
    String mobileNumber;
    @Override
    public boolean handleInput(HashMap<String, Object> Data) {
        if(Data.get("mobilenumber") == null)
            return false;
        mobileNumber = (String) Data.get("mobilenumber");
        return true;
    }

    @Override
    public double getCost() {
        return 5 + amount;
    }
}
