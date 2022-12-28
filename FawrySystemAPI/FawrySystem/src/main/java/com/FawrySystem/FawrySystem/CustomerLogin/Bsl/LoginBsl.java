package com.FawrySystem.FawrySystem.CustomerLogin.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
@Service
public class LoginBsl {
    ArrayList<Customer> customers = new ArrayList<>();
    public String checkAccount(Customer c){ //This function is used to check if the customer has account or not
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getEmail().equals(c.getEmail()) && customers.get(i).getPassword().equals(c.getPassword())){
                return "Successfully login";
            }
        }
        return "login failed";
    }

    public Customer getAccount(String userName)
    {
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getUserName() .equals(userName)){
                return customers.get(i);
            }
        }
        return null;
    }

    @PostMapping(value = "/signup")
    public String addAccount(@RequestBody Customer c){ //This function is used to check if the customer has account or not
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getEmail().equals(c.getEmail()) && customers.get(i).getPassword().equals(c.getPassword())){
                return "This account already exist";
            }
        }
        customers.add(c);
        return "Successfully sign up";
    }
}
