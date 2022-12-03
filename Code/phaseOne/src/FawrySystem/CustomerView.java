package FawrySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerView {
    public void Menu() {
        int choice;
        System.out.println("Enter 1- Sign up");
        System.out.println("2- Sign in");
        choice = Main.scanner.nextInt();
        if (choice == 1) {
            this.Sigup();
        } else {
            if (this.Signin()) {

            }
        }
    }

    public void Sigup() {
        while (true) {
            Scanner input = new Scanner(System.in);

            String username, email, password;
            System.out.print("Enter user name: ");
            username = input.nextLine();
//            System.out.println();

            System.out.print("Enter user Email: ");
            email = input.nextLine();
            System.out.println();

            System.out.print("Enter user password: ");
            password = input.nextLine();
            System.out.print("Enter phone number: ");
            String number = input.nextLine();

            CheckingAccount check = new CheckingAccount();
            if (check.checkAccount(Main.entity, email, password)) {
                System.out.println("Created account Successfully");
                Main.entity.AddCustomerAcc(new Customer(username, email, password,number));
                this.Signin();
                break;
            } else {
                System.out.println("This is already existing account");
                System.out.println("Enter another account");
            }
        }
    }

    public boolean Signin() {
        while (true) {
            String username, email, password;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter user name: ");
            username = input.nextLine();
            System.out.print("Enter user Email: ");
            email = input.nextLine();
            System.out.print("Enter user password: ");
            password = input.nextLine();
            CheckingAccount check = new CheckingAccount();
            if (check.checkAccount(Main.entity, email, password) == false) {
                System.out.println("Success login");
                System.out.println("1- Check request");
                System.out.println("2- Show services");
                System.out.println("3- Show Wallet");
                int choice = input.nextInt();
                if(choice == 1) {
                    this.checkMyRequest();
                }
                else if(choice == 2) {
                    this.showServices();
                }else if(choice == 3){
                    this.walletDetails();
                }
                return true;
            } else {
                System.out.println("Enter valid account");
            }
        }
    }
    public void walletDetails(){
        System.out.println("Wallet amount is: "+Main.currentCustomer.getWallet().getAmount());
    }


    public void checkMyRequest()
    {
        if(Main.currentCustomer.getRequest().isState() == true)
        {
            System.out.println("Accepted");
        }
        else {
            System.out.println("Denied");
        }
    }
    public void showServices() {
        Service myService;
        System.out.println("Our services");
        ArrayList<Service> services = Main.entity.getServices();
        for (int i = 0; i < services.size(); i++) {
            System.out.println((i + 1) + "- " + services.get(i).getDescription());
        }
        Scanner sc1 = new Scanner(System.in);
        int choice;
        choice = sc1.nextInt();

        myService = services.get(choice - 1); // Service........
        //System.out.println(myService.state);

        System.out.println("Choose service provider");
        for (int i = 0; i < Main.entity.getServiceProviders().size(); i++)
        {
            System.out.println((i + 1) + " - " +Main.entity.getServiceProviders().get(i).getName());
        }
        System.out.println("Enter the name of service provider");
        String choice1;
        choice1 = sc1.next();
        CustomerController c1 = new CustomerController();
        ServiceProviderFactory myServiceProviderFactory = c1.serviceProviderFactory(choice1);//ServiceProviderFactory...

        myServiceProviderFactory.setForm(myService);
    }
}
