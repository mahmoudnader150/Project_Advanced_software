package FawrySystem;

public abstract class Payment {
    public Service service;
    public Discount discount;

    /*Payment Constructor*/
    Payment(Service service , Discount discount){
        this.service = service;
        this.discount = discount;
    }

    /*confirm method for payment process*/
    abstract Boolean confirmPayment();

    /**/
    abstract Boolean checkAmount();

    /*pay the bill*/
    abstract void payBill();
}