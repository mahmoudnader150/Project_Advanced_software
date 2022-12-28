package com.FawrySystem.FawrySystem.CustomerLogin.Model;

import com.FawrySystem.FawrySystem.PaymentService.Bsl.Payment;
import com.FawrySystem.FawrySystem.RefundRequest.Model.RefundRequest;

public class Customer {
    public String userName, email, password;

    boolean fTime;
    public String phone;


    public Wallet wallet = new Wallet();
    public RefundRequest refundRequest;

    public RefundRequest getRefundRequest() {
        return refundRequest;
    }

    public void setRefundRequest(RefundRequest refundRequest) {
        this.refundRequest = refundRequest;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName, Payment p1) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addAmount(double amount)
    {
        wallet.setAmount(amount);
    }

    public void setfTime(boolean fTime) {
        this.fTime = fTime;
    }

    public boolean isfTime() {
        return fTime;
    }

    public Customer(String userName, String email, String password, String phone) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.fTime = false;
        this.wallet.amount = 50;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
