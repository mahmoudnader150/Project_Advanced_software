package FawrySystem;

public class CustomerInfo {
    String number;
    int amount;
    String email;
    public CustomerInfo(String number,int amount){
        this.number = number;
        this.amount = amount;
    }
    public CustomerInfo(String number ,int amount , String email) {
        this.number = number;
        this.amount = amount;
        this.email = email;
    }
}
