package FawrySystem;

public class VodafoneHandler implements IHandler{

    @Override
    public boolean FormHandler(double amount) {
      /* System.out.println("Vodafone Handler");
         System.out.println("----------------");*/
       if(amount<0){
           System.out.println("Invalid amount");
           return false;
       }
       if(amount<10){
           System.out.println("Minimum amount is 10$");
           return false;
       }
       return true;
    }
}
