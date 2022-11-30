package FawrySystem;

public class CreditCardPayment extends Payment {
    public Wallet customerWallet;
    CreditCardPayment(Service service,Discount discount,Wallet customerWallet){
        super(service,discount);
        this.customerWallet = customerWallet;
    }

    /*method for payment confirmation*/
    @Override
    Boolean confirmPayment(){
        System.out.println("Choose option to confirm payment using Credit Card: ");
        System.out.println("1-Confirm.");
        System.out.println("2-Cancel.");
        Integer x;
        x = Main.scanner.nextInt();
        if(x==1){
            return true;
        }
        return false;
    }

    /*method for comparing cost and amount*/
    Boolean checkAmount(){
        if(this.service.cost * this.discount.getPercent() <=customerWallet.amount && this.confirmPayment()){
            return true;
        }
        return false;
    }

    /*decrement money amount*/
    void payBill(){
        if(checkAmount()){
            this.customerWallet.amount -=this.service.cost * this.discount.percent;
        }
    }


}
