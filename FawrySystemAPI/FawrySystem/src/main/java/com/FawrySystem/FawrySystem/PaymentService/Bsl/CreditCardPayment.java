package com.FawrySystem.FawrySystem.PaymentService.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Wallet;

public class CreditCardPayment extends Payment {
    public String name;
    public String cardNumber;
    public String cvv;
    public String dateOfExpiry;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String  pay(double amount) {
        return (amount+" Paid with credit card");
    }

}
