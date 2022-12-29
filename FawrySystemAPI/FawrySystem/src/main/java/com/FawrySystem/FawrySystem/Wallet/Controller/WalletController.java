package com.FawrySystem.FawrySystem.Wallet.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Controller.LoginController;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.Wallet.Bsl.WalletBsl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    WalletBsl walletBsl;
    @Autowired
    LoginController loginController;

    @GetMapping(value = "/{userName}/getdetails")
    public String walletDetails(@PathVariable String userName){ // this function shows the customer's wallet
        Customer currentCustomer = loginController.getAccount(userName);
        return walletBsl.walletDetails(currentCustomer);
    }

    @PutMapping(value = "/{userName}/addamount/{amount}")
    public String addToWallet(@PathVariable String userName, @PathVariable("amount") double amount){ // this function shows the customer's wallet
        Customer currentCustomer = loginController.getAccount(userName);
        return walletBsl.addToWallet(currentCustomer,amount);
    }


}
