package com.FawrySystem.FawrySystem.Models;

import com.FawrySystem.FawrySystem.myService.Models.RefundRequest;

public class Customer {
    public String userName, email, password;
//    public ArrayList<Service> services;

    boolean fTime;
    public String phone;

//    public ArrayList<Service> getServices() {
//        return services;
//    }

    public Wallet wallet = new Wallet();
    public Payment p1;
    public RefundRequest request;

    public RefundRequest getRequest() {
        return request;
    }

    public void setRequest(RefundRequest request) {
        this.request = request;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName, Payment p1) {
        this.userName = userName;
        this.p1 = p1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setP1(Payment p1) {
        this.p1 = p1;
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
