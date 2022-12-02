package FawrySystem;

public class VodafoneHandler implements IHandler{

    @Override
    public void FormHandler(CustomerInfo customerInfo) {
      /* System.out.println("Vodafone Handler");
         System.out.println("----------------");*/
       if(customerInfo.amount>0 && customerInfo.number.length()==1){
           System.out.println("S");
       }
    }
}
