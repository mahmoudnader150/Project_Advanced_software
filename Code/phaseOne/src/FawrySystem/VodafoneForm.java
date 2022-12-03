package FawrySystem;

import java.sql.Ref;
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
        while (true) {
            System.out.println("1- Do payment");
            System.out.println("2- Refund request");
            System.out.println("3- Check Discount");
            System.out.println("4- Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            CustomerController c1 = new CustomerController();

            if (choice == 1) {
                double amount=0.0;
                boolean check = false;
                while(check==false) {
                    System.out.println("Enter the amount");
                    Scanner sc = new Scanner(System.in);
                    amount = sc.nextDouble();
                    IHandler vodafoneHandler = new VodafoneHandler();
                    check = vodafoneHandler.FormHandler(amount);
                }
          //      System.out.println(service.getCost());
                service.setCost(amount);
                Payment p1 = new CreditCardPayment();
                System.out.println("1- Credit card");
                System.out.println("2- Cash");
                Scanner sc1 = new Scanner(System.in);
                choice = sc1.nextInt();

                double totalCost = service.getCost();
                String.format("%.5f",totalCost);
                System.out.println("Before: " + totalCost);
                p1 = c1.setPaymentMethod(choice);
                boolean flag = false;
               if(service.state==true){
                   service = c1.setDiscount(service);
                   flag = true;
               }
                System.out.println("After: " + service.getCost());
                if(flag==false){
                    System.out.println(" (Admin didn't add discount)");
                }
                service.pay(p1);
             //   Main.entity.AddService(service);
            }else if(choice == 2) {
                double amount = 0.0;
                boolean check = false;
                while(check==false) {
                    System.out.println("Enter the amount");
                    Scanner sc = new Scanner(System.in);
                    amount = sc.nextDouble();
                    IHandler vodafoneHandler = new VodafoneHandler();
                    check = vodafoneHandler.FormHandler(amount);
                }
                System.out.println("Enter the transaction name");
                Scanner sc2 = new Scanner(System.in);
                String transaction = sc2.nextLine();
                Main.currentCustomer.setRequest(new RefundRequest(transaction, amount));
                Main.entity.addRequest(Main.currentCustomer.getRequest());
                // c1.checkTransaction();
            }
            else if(choice==3){
                for (int i=0;i<Main.entity.getServices().size();i++){
                    if(Main.entity.getServices().get(i).state==true){
                        System.out.println((Main.entity.getServices().get(i).getDescription() + " has discount"));
                    }
                }
            }
            else if(choice == 4)
            {
                return;
            }
            else {
                System.out.println("Enter valid choice");
            }
        }
    }

}
