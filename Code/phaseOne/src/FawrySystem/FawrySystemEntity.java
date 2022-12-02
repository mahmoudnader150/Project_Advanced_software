package FawrySystem;

import java.util.ArrayList;

public class FawrySystemEntity {
    public ArrayList<Customer>customers;
    public ArrayList<ServiceProviderFactory>serviceProviders;
    public ArrayList<Service>services;
  //  public Arr

    public Admin admin;

    public FawrySystemEntity() {
        this.customers = new ArrayList<>();
        this.serviceProviders = new ArrayList<>();
        this.services = new ArrayList<>();
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
