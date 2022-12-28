package com.FawrySystem.FawrySystem.PaymentService.Bsl;

//import com.FawrySystem.FawrySystem.PaymentService.Model.MyService;
import com.FawrySystem.FawrySystem.CustomerLogin.Bsl.LoginBsl;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.PaymentService.Model.ServiceProviderFactory;
import com.FawrySystem.FawrySystem.PaymentService.Model.PaymentTransaction;
import org.springframework.stereotype.Service;
//import static com.FawrySystem.FawrySystem.CustomerLogin.Controller.LoginController.currentCustomer;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PaymentBsl {
//    ArrayList<MyService> services = new ArrayList<>();
//    ArrayList<RefundRequest> refundRequests = new ArrayList<>();
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
        ServiceBsl c1 = new ServiceBsl();

        DiscountLogic d1 = new DiscountLogic();

        ServiceProviderFactory myServiceProviderFactory = c1.serviceProviderFactory(serviceProvider);//ServiceProviderFactory...

        if(myServiceProviderFactory.handleInput(Data) == false)
        {
            return "Enter valid data";
        }

        myServiceProviderFactory.setAmount(amount);

        if(currentCustomer.isfTime() == false) // first time
        {
            myServiceProviderFactory = d1.setOverallDiscount(currentCustomer,myServiceProviderFactory);
        }
        if(serviceProvider.toLowerCase() .equals("vodafonecash")) // add special discount
        {
            myServiceProviderFactory = d1.setSpecificDiscount(myServiceProviderFactory);
        }


        double totalCost = (myServiceProviderFactory.getCost());
        String formattedValue = String.format("%.2f", totalCost);

        paymentTransactions.add(new PaymentTransaction(serviceName, formattedValue, currentCustomer, serviceProvider));

        return "Total cost: "+ formattedValue;
    }
    public String pay(Customer currentCustomer, String choice, double amount)
    {
        PaymentMethodLogic paymentMethodLogic = new PaymentMethodLogic();

        Payment payment = paymentMethodLogic.setPaymentMethod(choice, currentCustomer);

        return payment.pay(amount);
    }
}
