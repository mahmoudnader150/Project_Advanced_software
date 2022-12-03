package FawrySystem;

public class CustomerController {
    public Service setDiscount(Service service) {
        if (Main.currentCustomer.isfTime() == false) {
            service = new OverallDiscount(service);
            System.out.println("First time discount");
            Main.currentCustomer.setfTime(true);
        }
        service = new SpecificDiscount(service);
        return service;
    }

    public boolean checkTransaction(String tName, double amount) {
        for (int i = 0; i < Main.currentCustomer.getServices().size(); i++) {
            if (tName.equals(Main.currentCustomer.getServices().get(i).getDescription()) &&
                    amount <= Main.currentCustomer.getServices().get(i).getCost()) {
                return true;
            }
        }
        return false;
    }

    public Payment setPaymentMethod(int choice) {
        if (choice == 1) {
            return new CreditCardPayment();
        } else {
            return new CashPayment();
        }
    }

    public ServiceProviderFactory serviceProviderFactory(String choice) {
        if (choice.equals("vodafone")) {
            return new Vodafone("Vodafone");
        } else if (choice.equals("we")) {
            return new We("We");
        }
        return new We("We");
    }
}
