package com.FawrySystem.FawrySystem.Customer;

import com.FawrySystem.FawrySystem.Models.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController //return Data
@RequestMapping("/customer")
public class LoginController {
    ArrayList<Customer> customers = new ArrayList<>();
    public static Customer currentCustomer;

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    @PostMapping(value = "/signin")
    public String checkAccount(@RequestBody Customer c){ //This function is used to check if the customer has account or not
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getEmail().equals(c.getEmail()) && customers.get(i).getPassword().equals(c.getPassword())){
//                Main.currentCustomer=customers.get(i);
                currentCustomer = c;
                return "Successfully login";
            }
        }
        return "login failed";
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
