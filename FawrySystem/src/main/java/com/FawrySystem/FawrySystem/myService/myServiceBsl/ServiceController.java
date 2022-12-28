package com.FawrySystem.FawrySystem.myService.myServiceBsl;

import com.FawrySystem.FawrySystem.myService.Models.Vodafone;
import com.FawrySystem.FawrySystem.myService.Models.We;
import com.FawrySystem.FawrySystem.myService.Models.*;

public class ServiceController {
    public Service chooseService(String name) {    //Choosing the service
        if (name.equals("landline")) {
            return new LandlineServices(2.5,"Landline Service");
        } else if (name.equals("mobilerecharge")) {
            return new MobilRecharge(5.5, "Mobile recharge");
        }
        else if(name.equals("internetpayment"))
        {
            return new InternetPayment(5.5, "Internet Payment");
        }
        else if(name.equals("donations"))
        {
            return new Donations(5.5, "Donations");
        }
        return new LandlineServices(2.5,"Landline Service");
    }
    public ServiceProviderFactory serviceProviderFactory(String choice) {
        if (choice.equals("vodafone")) {    //setting service provider factory for the customer
            return new Vodafone("Vodafone");
        } else if (choice.equals("we")) {
            return new We("We");
        }
        return new We("We");
    }
}
