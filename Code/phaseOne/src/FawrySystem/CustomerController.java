package FawrySystem;

public class CustomerController {
    public Service setSpecificDiscount(Service service) { //the system will add overall discount if it's the first time for that customer to do payment
        service = new SpecificDiscount(service);
        return service;
    }
    public Service setOverallDiscount(Service service) {
        Main.currentCustomer.fTime = true;
        service = new OverallDiscount(service);
        return service;
    }
        public Payment setPaymentMethod(int choice) { // setting payment method for the customer
        if (choice == 1) {
            return new CreditCardPayment();
        } else {
            return new CashPayment();
        }
    }

    public ServiceProviderFactory serviceProviderFactory(String choice) {
        if (choice.equals("vodafone")) {    //setting service provider factory for the customer
            return new Vodafone("Vodafone");
        } else if (choice.equals("we")) {
            return new We("We");
        }
        return new We("We");
    }
    public Service chooseService(String name) {    //Choosing the service
        if (name.equals("Landline Service")) {
            return new LandlineServices(2.5,"Landline Service");
        } else if (name.equals("Mobile recharge")) {
            return new MobilRecharge(5.5, "Mobile recharge");
        }
        else if(name.equals("Internet Payment"))
        {
            return new InternetPayment(5.5, "Internet Payment");
        }
        else if(name.equals("Donations"))
        {
            return new Donations(5.5, "Donations");
        }
        return new LandlineServices(2.5,"Landline Service");
    }
}
