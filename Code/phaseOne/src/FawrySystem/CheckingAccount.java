package FawrySystem;

import java.util.ArrayList;

public class CheckingAccount {
    public Boolean checkAccount(FawrySystemEntity e,String email,String password){
        ArrayList<Customer> customers = e.getCustomerAcc();
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getEmail().equals(email) && customers.get(i).getPassword().equals(password))
                return false;
        }
        return true;
    }
}
