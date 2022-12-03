package FawrySystem;

import java.util.Scanner;

public class AdminView {
    public Boolean menu() {
        System.out.println();
        while (true) {
            String name;
            String password, email;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Email : ");
            email = input.nextLine();

            System.out.print("Enter user name : ");
            name = input.nextLine();

            System.out.print("Enter Password : ");
            password = input.nextLine();


            if (name.equals(Main.ad.getUserName()) && password.equals(Main.ad.getPassword()) && email.equals(Main.ad.getEmail())) {
                System.out.println("Success login");
                this.functions();
                return true;
            }
        }


    }

    public void functions() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Type yes to show list all refund requests");
            System.out.println("Type -1 to exit");
            String choice = input.nextLine();

            if(choice.equals("-1"))
                return;
            else if(choice.equals("yes"))
            {
                AdminController adminController = new AdminController();
                adminController.checkRequest();
                return;
            }
        }
    }
}
