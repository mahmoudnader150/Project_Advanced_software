package com.FawrySystem.FawrySystem.Wallet.Controller;

import com.FawrySystem.FawrySystem.Wallet.Bsl.WalletBsl;
import com.FawrySystem.FawrySystem.Wallet.Model.WalletTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/admin")
public class AdminWalletController {
    @Autowired
    WalletBsl walletBsl;
    @GetMapping(value = "/getWalletTrancations")
    public ArrayList<WalletTransaction> walletTransactions(){ // this function shows the customer's wallet
        return walletBsl.getWalletTransactions();
    }
}
