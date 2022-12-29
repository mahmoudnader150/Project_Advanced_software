package com.FawrySystem.FawrySystem.PaymentService.Model;

import java.util.HashMap;

public class WeInternet extends ServiceProvider {
    String phone;

    @Override
    public boolean handleInput(HashMap<String, Object> Data) {
        if(Data.get("phone") == null)
            return false;
        phone = (String) Data.get("phone");
        return true;
    }

    @Override
    public double getCost() {
        return 5 + amount;
    }


}
