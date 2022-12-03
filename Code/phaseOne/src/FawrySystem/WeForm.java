package FawrySystem;

import java.util.Scanner;

public class WeForm extends Form {
    WeForm(IHandler handler) {
        super(handler);
    }

    @Override
    public void showForm(Service service) {
        Scanner ss = new Scanner(System.in);
        System.out.println("-WE Form-");
        System.out.println("--------------");
        System.out.println("1- Do payment");
        System.out.println("2- Refund request");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        CustomerController c1 = new CustomerController();
        if (choice == 1) {
            System.out.println("Enter the amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            service.setCost(amount);
            Payment p1 = new CreditCardPayment();
            System.out.println("1- Credit card");
            System.out.println("2- Cash");
            Scanner sc1 = new Scanner(System.in);
            choice = sc1.nextInt();

            p1 = c1.setPaymentMethod(choice);
            service = c1.setDiscount(service);
            service.pay(p1);
            Main.entity.AddService(service);
        } else {
            System.out.println("Enter the amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            System.out.println("Enter the transaction name");
            Scanner sc2 = new Scanner(System.in);
            String transaction = sc2.nextLine();
            Main.currentCustomer.setRequest(new RefundRequest(transaction, amount));
            Main.entity.addRequest(Main.currentCustomer.getRequest());
            //            c1.checkTransaction();
        }
    }
}
