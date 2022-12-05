package FawrySystem;

import java.util.ArrayList;

public class CheckingAccount {
    public Boolean checkAccount(FawrySystemEntity e,String email,String password){ //This function is used to check if the customer has account or not
        ArrayList<Customer> customers = e.getCustomerAcc();
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getEmail().equals(email) && customers.get(i).getPassword().equals(password)){
                Main.currentCustomer=customers.get(i);
                return false;

            }

        }
        return true;
    }
}
