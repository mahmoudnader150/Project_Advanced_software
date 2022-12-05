package FawrySystem;

import java.util.Locale;
import java.util.Scanner;

public class AdminView {
    public Boolean menu() { //login for admin
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
            System.out.println("1- show list all refund requests");
            System.out.println("2- Set Discounts on Services");
            System.out.println("3- exit");
            int choice = input.nextInt();

            if(choice==3)
                return;
            else if(choice==1)
            {
                AdminController adminController = new AdminController();
                adminController.checkRequest();
                return;
            }else if(choice==2){ // the admin which service he wants to add discount
                for(int i=0;i<Main.entity.getServices().size();i++){
                    System.out.print("Do you want to add discount on : ");
                    System.out.print(Main.entity.getServices().get(i).getDescription());
                    System.out.println(" yes/no");
                    Scanner scs = new Scanner(System.in);
                    String thechoice;
                    thechoice = scs.nextLine();
                    thechoice = thechoice.toLowerCase();
                    if(thechoice.equals("yes")){
//                        Main.entity.getServices().get(i).state=true;
                        Main.entity.allDiscounts.add(Main.entity.getServices().get(i).getDescription());
                    }else{
                        continue;
                    }
                }
            }
        }
    }
}
