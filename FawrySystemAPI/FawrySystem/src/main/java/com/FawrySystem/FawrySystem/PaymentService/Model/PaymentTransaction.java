package com.FawrySystem.FawrySystem.PaymentService.Model;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;

public class PaymentTransaction {
    String serviceName;

    String totalAmount;
    Customer customer;
    public PaymentTransaction(String serviceName, String totalAmount, Customer c, String amout) {
        this.serviceName = serviceName;
        this.totalAmount = totalAmount;
        this.customer = c;
    }
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
