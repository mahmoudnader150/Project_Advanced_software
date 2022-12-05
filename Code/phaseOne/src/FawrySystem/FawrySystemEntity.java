package FawrySystem;

import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;
public class FawrySystemEntity {
    public ArrayList<Customer>customers;
    public ArrayList<ServiceProviderFactory>serviceProviders;
    public ArrayList<Service>services;
    public ArrayList<RefundRequest>refundRequests;

    public ArrayList<String>allDiscounts;
    public FawrySystemEntity() {
        this.customers = new ArrayList<>();
        this.serviceProviders = new ArrayList<>();
        this.services = new ArrayList<>();
        this.refundRequests = new ArrayList<>();
        this.allDiscounts = new ArrayList<>();
    }
    public void addDiscount(String discount)
    {
        allDiscounts.add(discount);
    }

    public void addRequest(RefundRequest refundRequest)
    {
        refundRequests.add(refundRequest);
    }
    public void deleteRequest(RefundRequest refundRequest)
    {
        refundRequests.remove(refundRequest);
    }
    public void notifyRequest() //the customer should notify all requests if it's accepted or not
    {
        for (int i = 0; i < refundRequests.size(); i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("The transaction name: " +refundRequests.get(i).getTransactionName());
            System.out.println("amount: " +refundRequests.get(i).getAmount());

            int choice = input.nextInt();
            if(choice == 1){
                refundRequests.get(i).update(true);
            }
            else {
                refundRequests.get(i).update(false);
            }
        }
    }
    public void AddCustomerAcc(Customer c){
        customers.add(c);
    }

    public void AddServiceProviderFactory (ServiceProviderFactory  sp){
        serviceProviders.add(sp);
    }
    public void AddService(Service s){
        services.add(s);
    }
    public ArrayList<Customer> getCustomerAcc(){
return customers ;
    }
    public ArrayList<Service> getServices(){
        return services ;
    }
    public ArrayList<ServiceProviderFactory> getServiceProviders(){
        return serviceProviders ;
    }
}
