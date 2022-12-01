package FawrySystem;

public class CashPayment extends Payment{
    public Double amount;
    CashPayment(Service service,Discount discount,Double amount){
        super(service,discount);
        this.amount = amount;
    }

    /*method for payment confirmation*/
    @Override
    Boolean confirmPayment(){
        System.out.println("Choose option to confirm payment using cash: ");
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
    @Override
    Boolean checkAmount(){
       if(this.service.hasDiscount()){
           if(this.service.cost * this.discount.getPrecent() <= this.amount && this.confirmPayment() ){
               return true;
           }
       }else{

       }

        return false;
    }

    /*decrement money amount*/
    @Override
    void payBill(){
        if(checkAmount()){
            this.amount-=this.service.cost * this.discount.percent;
        }
    }
}
