package FawrySystem;

import java.util.Scanner;

public class VodafoneForm extends Form{

    VodafoneForm(IHandler handler) {
        super(handler);
    }


    @Override
    public void showForm(Service service) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Vodafone Form");
        System.out.println("--------------");
        System.out.println("1- Do payment");
        System.out.println("2- Refund request");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Enter the amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            service.setCost(amount);
            Payment p1 = new CreditCardPayment();
            System.out.println("1- Credit card");
            System.out.println("2- Cash");
            Scanner sc1 = new Scanner(System.in);
            choice = sc1.nextInt();
            CustomerController c1 = new CustomerController();
            p1 = c1.setPaymentMethod(choice);
            service.pay(p1);
        }
        else{

        }
//        System.out.print("Enter your Mobile Number: ");
//        String number;
//        number = ss.next();
//        System.out.print("Enter your Amount: ");
//        int amount;
//        amount = ss.nextInt();
//
//        this.handler.FormHandler(new CustomerInfo(number,amount));
    }

}
