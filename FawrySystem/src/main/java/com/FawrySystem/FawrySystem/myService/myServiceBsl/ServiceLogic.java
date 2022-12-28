package com.FawrySystem.FawrySystem.myService.myServiceBsl;

import com.FawrySystem.FawrySystem.myService.Models.RefundRequest;
import com.FawrySystem.FawrySystem.myService.Models.Service;
import com.FawrySystem.FawrySystem.myService.Models.ServiceProviderFactory;

import java.util.ArrayList;

public class ServiceLogic {
    ArrayList<Service> services = new ArrayList<>();
    ArrayList<RefundRequest> refundRequests = new ArrayList<>();

    public void doPayment(String serviceName, String choice1, int choice, double amount)
    {
        ServiceController c1 = new ServiceController();

        Service myService = c1.chooseService(serviceName);

        ServiceProviderFactory myServiceProviderFactory = c1.serviceProviderFactory(choice1);//ServiceProviderFactory...

        services.add(myService);

        myServiceProviderFactory.setForm(myService, choice, amount);
    }
}
