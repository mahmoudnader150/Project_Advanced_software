package com.FawrySystem.FawrySystem.myService.Models;

public class RefundRequest {
    public boolean state;
    public String transactionName;
    double amount;

    public RefundRequest(String transactionName, double amount) {
        this.transactionName = transactionName;
        this.amount = amount;
        state = false;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isState() {
        return state;
    }

    //    public void update(boolean state) { for nowwwwwwwwwwwwwwwwwww
//        this.state = state;
//        if(state==true){
//            Main.currentCustomer.getWallet().addAmount(this.amount);
//        }
//    }
}
