package com.FawrySystem.FawrySystem.Form;

public class VodafoneHandler implements IHandler{
    @Override
    public boolean FormHandler(double amount) { // the minimum amount to be paid is 10$
        if(amount<0){
            System.out.println("Invalid amount");
            return false;
        }
        if(amount<10){
            System.out.println("Minimum amount is 10$");
            return false;
        }
        return true;
    }
}
