package FawrySystem;

import java.util.Scanner;

public class Main {
    static Customer currentCustomer;
    static Scanner scanner = new Scanner(System.in);
    static Admin ad=new Admin("hassan","0000","hassan@fawry");
    static FawrySystemEntity entity = new FawrySystemEntity();
    public static void main(String[] args) {
        Customer c=new Customer("zeyad","z@1","1234","03312");
        Customer c2=new Customer("nader","n@2","12345","0122");
        Customer c3=new Customer("nasser","m@3","123","01523");
        Customer c4=new Customer("hussein","h@4","123456","01180");

        Service s1 = new LandlineServices(5.50,"landline");
        Service s2 = new MobilRecharge(60.7,"Mobil recharge");
        Service s3 = new InternetPayment(80.5, "Internet payment");
        Service s4 = new Donations(100.5, "Donations");


        ServiceProviderFactory sp1 = new Vodafone("Vodafone");
        ServiceProviderFactory sp2 = new We("We");

        entity.AddServiceProviderFactory(sp1);
        entity.AddServiceProviderFactory(sp2);


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
            else if(choice == 2)
            {
                AdminView adminView = new AdminView();
                adminView.menu();
            }
            else if(choice == 3)
            {
                break;
            }
        }

    }
}
