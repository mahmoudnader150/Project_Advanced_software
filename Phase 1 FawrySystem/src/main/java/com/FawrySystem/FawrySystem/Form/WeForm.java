package com.FawrySystem.FawrySystem.Form;

import com.FawrySystem.FawrySystem.myService.Models.Service;

import java.util.Scanner;

import static com.FawrySystem.FawrySystem.Customer.LoginController.currentCustomer;

public class WeForm extends Form{
    public WeForm(IHandler handler) {
        super(handler);
    }

    @Override
    public void showForm(Service service) {
        Scanner ss = new Scanner(System.in);
        System.out.println("WE Form");
        System.out.println("--------------");
        System.out.println("You have: " + currentCustomer.wallet.getAmount() + "$ In your wallet");
        while (true) {
            System.out.println("1- Do payment");
            System.out.println("2- Refund request to wallet");
            System.out.println("3- Check Discount");
            System.out.println("4- Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            CustomerController c1 = new CustomerController();
            boolean isdone = false;

            if (choice == 1 && !isdone) {
                double amount=0.0;
                boolean check = false;
                while(check==false) {
                    System.out.println("Enter the amount");
                    Scanner sc = new Scanner(System.in);
                    amount = sc.nextDouble();
                    IHandler WEHandler = new WeHandler();
                    check = WEHandler.FormHandler(amount);
                }
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
                if(Main.currentCustomer.isfTime() == true){
                    service = c1.setOverallDiscount(service);
                }
                service = c1.setSpecificDiscount(service);
                System.out.println("After: " + service.getCost());
                if(flag==false){
                    System.out.println(" (Admin didn't add discount)");
                }

                service.pay(p1);
                Main.entity.AddService(service);
            } else if(choice == 2) {
                double amount=0.0;
                boolean check = false;
                while(check==false) {
                    System.out.println("Enter the amount");
                    Scanner sc = new Scanner(System.in);
                    amount = sc.nextDouble();
                    IHandler WEHandler = new WeHandler();
                    check = WEHandler.FormHandler(amount);
                }
                System.out.println("Enter the transaction name");
                Scanner sc2 = new Scanner(System.in);
                String transaction = sc2.nextLine();
                Main.currentCustomer.setRequest(new RefundRequest(transaction, amount));
                Main.entity.addRequest(Main.currentCustomer.getRequest());
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
            else if(choice == 1 && isdone == true)
            {
                System.out.println("You have already paid this service");
            }
            else {
                System.out.println("Enter valid choice");
            }
        }
    }
}
