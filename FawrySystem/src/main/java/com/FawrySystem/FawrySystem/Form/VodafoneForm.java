package com.FawrySystem.FawrySystem.Form;

import com.FawrySystem.FawrySystem.Models.CreditCardPayment;
import com.FawrySystem.FawrySystem.Models.Payment;
import com.FawrySystem.FawrySystem.myService.Models.*;
import com.FawrySystem.FawrySystem.myService.myServiceBsl.DiscountLogic;

import java.util.Scanner;

import static com.FawrySystem.FawrySystem.Customer.LoginController.currentCustomer;

public class VodafoneForm extends Form{
    public VodafoneForm(IHandler handler) {
        super(handler);
    }


    @Override
    public void showForm(Service service, int choice, double amount) {

        boolean isdone = false;

        DiscountLogic c1 = new DiscountLogic();

        boolean check = false;
        // check if the form handler accept the customer's input or not
        //                  System.out.println("Enter the amount");
        //                  Scanner sc = new Scanner(System.in);
        //                   amount = sc.nextDouble();
        IHandler vodafoneHandler = new VodafoneHandler();
        System.out.println(amount);
        check = vodafoneHandler.FormHandler(amount);
        service.setCost(amount); // setting the cost of the service
        Payment p1 = new CreditCardPayment();
//                System.out.println("1- Credit card");
//                System.out.println("2- Cash");
//                Scanner sc1 = new Scanner(System.in);
//                choice = sc1.nextInt();

        double totalCost = service.getCost();
        String.format("%.5f", totalCost);
//                System.out.println("Before: " + totalCost);
        p1 = c1.setPaymentMethod(choice); // setting the payment method
        boolean flag = false;
        if (currentCustomer.isfTime() == false) {
//                    System.out.println("First time Discount");
            service = c1.setOverallDiscount(service);
        }
        for (int i = 0; i < Main.entity.allDiscounts.size(); i++) {
            if (Main.entity.allDiscounts.get(i).equals(service.getDescription())) {
                service = c1.setSpecificDiscount(service);
                flag = true;
            }
        }

        System.out.println("After: " + service.getCost());
        if (flag == false) {
//                    System.out.println("(Admin didn't add discount for this service)");
        }
        service.pay(p1); // pay the service
        isdone = true;
//        else if (choice == 3) {
//            for (int i = 0; i < Main.entity.getServices().size(); i++) {
//                if (Main.entity.getServices().get(i).state == true) {
//                    System.out.println((Main.entity.getServices().get(i).getDescription() + " has discount"));
//                }
//            }
//        } else if (choice == 1 && isdone == true) {
//                System.out.println("You have already paid for this service");
//        }
    }
}
