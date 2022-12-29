package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;

public class PaymentFactory {
    public Payment setPaymentMethod(String choice, Customer currentCustomer) { // setting payment method for the customer
        if (choice.toLowerCase().equals("creditcardpayment")) {
            return new CreditCardPayment();
        } else if(choice.toLowerCase().equals("cashpayment")) {
            return new CashPayment();
        }
        else
        {
            return new WalletPayment(currentCustomer);
        }
    }
}
