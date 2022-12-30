package com.FawrySystem.FawrySystem.Wallet.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.Wallet.Model.WalletTransaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WalletBsl {

    ArrayList<WalletTransaction> walletTransactions = new ArrayList<>();
    public String walletDetails(Customer currentCustomer){ // this function shows the customer's wallet

        return ("Wallet amount is: "+currentCustomer.getWallet().getAmount());
    }

    public ArrayList<WalletTransaction> getWalletTransactions() {
        return walletTransactions;
    }

    public String addToWallet(Customer currentCustomer, double amount)
    {
        currentCustomer.addAmount(amount);
        walletTransactions.add(new WalletTransaction(currentCustomer,amount));
        return "Added Successfully";
    }
}
