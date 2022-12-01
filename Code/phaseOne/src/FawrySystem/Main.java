package FawrySystem;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Admin ad=new Admin("admin","1234","admin@fawry");
    static FawrySystemEntity entity = new FawrySystemEntity();
    public static void main(String[] args) {
        Customer c=new Customer("seif","a@3","123");
        Customer c2=new Customer("ahmed","a@3","123");
        Customer c3=new Customer("Mohamed","a@3","123");
        Customer c4=new Customer("hussein","a@3","123");

        Service s1 = new LandlineServices(5.50,"landline");
        Service s2 = new MobilRecharge(60.7,"Mobil recharge");
        Service s3 = new InternetPayment(80.5, "Internet payment");
        Service s4 = new Donations(100.5, "Donations");

        entity.AddCustomerAcc(c);
        entity.AddCustomerAcc(c2);
        entity.AddCustomerAcc(c4);
        entity.AddCustomerAcc(c3);

        entity.AddService(s1);
        entity.AddService(s2);
        entity.AddService(s3);
        entity.AddService(s4);

        System.out.println("Welcome to Fawry System");
        while (true)
        {
            int choice;
            System.out.println("1- Customer");
            System.out.println("2- Admin");
            System.out.println("3- Exit");

            choice = scanner.nextInt();
            if(choice == 1)
            {
                CustomerView obj = new CustomerView();
                obj.Menu();

            }




            if(choice == 3)
            {
                break;
            }
        }

    }
}
