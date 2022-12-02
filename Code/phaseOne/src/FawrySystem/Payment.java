package FawrySystem;

public abstract class Payment {
    public Service service;
    public Discount discount;

    /*Payment Constructor*/


    public abstract void pay(double amount);

    /*confirm method for payment process*/
    abstract Boolean confirmPayment();

    /**/
    abstract Boolean checkAmount();

    /*pay the bill*/
    abstract void payBill();
}
