package FawrySystem;

import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;
public class FawrySystemEntity {
    public ArrayList<Customer>customers;
    public ArrayList<ServiceProviderFactory>serviceProviders;
    public ArrayList<Entry<Customer,Service>>transactions;
    public ArrayList<Service>services;
  //  public Arr

    public Admin admin;

    public FawrySystemEntity() {
        this.customers = new ArrayList<>();
        this.serviceProviders = new ArrayList<>();
        this.services = new ArrayList<>();
    }


//public void addTransaction(Service s,Customer c){
//    Entry p1 = new Pair(s,c);
//transactions.add(Entry{s,c});
//
//}
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
