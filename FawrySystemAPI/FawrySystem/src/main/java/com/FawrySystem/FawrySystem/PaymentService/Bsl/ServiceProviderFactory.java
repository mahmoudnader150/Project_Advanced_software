package com.FawrySystem.FawrySystem.PaymentService.Bsl;
import com.FawrySystem.FawrySystem.PaymentService.Model.*;
import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProvider;

public class ServiceProviderFactory {

    public ServiceProvider setServiceProvider(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("vodafonecash")) {    //setting service provider for the customer
            return new VodafoneCash();
        } else if (choice.equals("weinternet")) {
            return new WeInternet();
        }
        else if(choice.equals("orangeinternet")) {
            return new OrangeInternet();
        }
        else if(choice.equals("vodafoneinternet"))
        {
            return new VodafoneInternet();
        }
        return null;
    }
}
