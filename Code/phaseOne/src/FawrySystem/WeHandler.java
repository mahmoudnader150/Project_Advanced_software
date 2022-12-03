package FawrySystem;

public class WeHandler implements IHandler{


    @Override
    public boolean FormHandler(double amount) {
        if(amount<0){
            System.out.println("Invalid amount");
            return false;
        }
        if(amount<20){
            System.out.println("Minimum amount is 20$");
            return false;
        }
        return true;
    }
}
