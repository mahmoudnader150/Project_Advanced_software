package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProvider;
import com.FawrySystem.FawrySystem.PaymentService.Model.PaymentTransaction;
import org.springframework.stereotype.Service;
//import static com.FawrySystem.FawrySystem.CustomerLogin.Controller.LoginController.currentCustomer;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PaymentBsl {

    ArrayList<PaymentTransaction>paymentTransactions = new ArrayList<>();

    public ArrayList<PaymentTransaction> getPaymentTransaction() {
        return paymentTransactions;
    }

    public String getCost(Customer currentCustomer, HashMap<String ,Object> Data)
    {

        String serviceProvider = (String) Data.get("serviceProvider");
        String serviceName = (String) Data.get("serviceName");
        Double amount = (Double) Data.get("amount");
        String phone = (String) Data.get("phone");

        if(currentCustomer == null)
        {
            return "You must login first";
        }
        ServiceProviderFactory c1 = new ServiceProviderFactory();

        DiscountLogic d1 = new DiscountLogic();

        ServiceProvider myServiceProvider = c1.setServiceProvider(serviceProvider);//ServiceProviderFactory...

        if(myServiceProvider.handleInput(Data) == false)
        {
            return "Enter valid data";
        }

        myServiceProvider.setAmount(amount);

        if(currentCustomer.isfTime() == false) // first time
        {
            myServiceProvider = d1.setOverallDiscount(currentCustomer, myServiceProvider);
        }
        if(serviceProvider.toLowerCase() .equals("vodafonecash")) // add special discount
        {
            myServiceProvider = d1.setSpecificDiscount(myServiceProvider);
        }


        double totalCost = (myServiceProvider.getCost());
        String formattedValue = String.format("%.2f", totalCost);

        paymentTransactions.add(new PaymentTransaction(serviceName, formattedValue, currentCustomer, serviceProvider));

        return "Total cost: "+ formattedValue;
    }
    public String pay(Customer currentCustomer, String choice, double amount)
    {
        PaymentFactory paymentFactory = new PaymentFactory();

        Payment payment = paymentFactory.setPaymentMethod(choice, currentCustomer);

        return payment.pay(amount);
    }
}