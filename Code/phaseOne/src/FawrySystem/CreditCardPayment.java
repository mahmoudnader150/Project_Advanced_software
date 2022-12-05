package FawrySystem;

public class CreditCardPayment extends Payment {
    public Wallet customerWallet;
    public String name;
    public String cardNumber;
    public String cvv;
    public String dateOfExpiry;

    @Override
    public void pay(double amount) {
        System.out.println(amount+" Paid with credit card");
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


//    /*method for comparing cost and amount*/
    @Override
    Boolean checkAmount(){
        if(this.service.cost * this.discount.getPercent() <=customerWallet.amount && this.confirmPayment()){
            return true;
        }
        return false;
    }


}
