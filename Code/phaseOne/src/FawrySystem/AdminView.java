package FawrySystem;

public class AdminView {
    public Boolean menu() {
        System.out.println();
        while (true) {
            String name;
            String password, email;
            System.out.print(" Enter Email : ");
            email = Main.scanner.nextLine();
            System.out.print("Enter user name : ");
            name = Main.scanner.nextLine();
            System.out.print(" Enter Password : ");
            password = Main.scanner.nextLine();


            if (name.equals(Main.ad.getUserName()) && password.equals(Main.ad.getPassword()) && email.equals(Main.ad.getEmail()))
            {
return true;
            }
        }


    }

    public void functions() {
    while (true){
        int choice;

        System.out.println(" 1- Add service provider ");
        System.out.println(" 2- Add discount ");
        System.out.println(" 3- Show refund request list ");
        choice=Main.scanner.nextInt();
        if (choice==1){

        }
        if (choice==2){

        }
        if (choice==3){

        }

    }
    }
}
