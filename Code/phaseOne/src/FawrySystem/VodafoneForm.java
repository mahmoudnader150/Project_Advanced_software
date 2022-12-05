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
        boolean isdone = false;
        System.out.println("You have: " + Main.currentCustomer.wallet.getAmount() + "$ In your wallet");
        while (true) {
            System.out.println("1- Do payment");
            System.out.println("2- Refund request to wallet");
            System.out.println("3- Check Discount");
            System.out.println("4- Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            CustomerController c1 = new CustomerController();

            if (choice == 1 && !isdone) { // if the customer paid some service so there is no need to pay it again
                double amount=0.0;
                boolean check = false;
                while(check==false) { // check if the form handler accept the customer's input or not
                    System.out.println("Enter the amount");
                    Scanner sc = new Scanner(System.in);
                    amount = sc.nextDouble();
                    IHandler vodafoneHandler = new VodafoneHandler();
                    check = vodafoneHandler.FormHandler(amount);
                }
                service.setCost(amount); // setting the cost of the service
                Payment p1 = new CreditCardPayment();
                System.out.println("1- Credit card");
                System.out.println("2- Cash");
                Scanner sc1 = new Scanner(System.in);
                choice = sc1.nextInt();

                double totalCost = service.getCost();
                String.format("%.5f",totalCost);
                System.out.println("Before: " + totalCost);
                p1 = c1.setPaymentMethod(choice); // setting the payment method
                boolean flag = false;
                if(Main.currentCustomer.isfTime() == false){
                    System.out.println("First time Discount");
                    service = c1.setOverallDiscount(service);
                }
                for (int i = 0; i < Main.entity.allDiscounts.size(); i++)
                {
                    if(Main.entity.allDiscounts.get(i).equals(service.getDescription()))
                    {
                        service = c1.setSpecificDiscount(service);
                        flag = true;
                    }
                }

                System.out.println("After: " + service.getCost());
                if(flag==false){
                    System.out.println("(Admin didn't add discount for this service)");
                }
                service.pay(p1); // pay the service
                isdone = true;
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
                Main.currentCustomer.setRequest(new RefundRequest(transaction, amount)); // make refund request
                Main.entity.addRequest(Main.currentCustomer.getRequest());
            }
            else if(choice==3){
                for (int i=0;i<Main.entity.getServices().size();i++){
                    if(Main.entity.getServices().get(i).state==true){
                        System.out.println((Main.entity.getServices().get(i).getDescription() + " has discount"));
                    }
                }
            }
            else if(choice == 1 && isdone == true)
            {
                System.out.println("You have already paid for this service");
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
