package FawrySystem;

import java.util.Scanner;

public class WeForm extends Form{
    WeForm(IHandler handler) {
        super(handler);
    }

    @Override
    public void showForm() {
        Scanner ss = new Scanner(System.in);
        System.out.println("--WE Form--");
        System.out.println("--------------");

        System.out.print("Enter your Mobile Number: ");
        String number;
        number = ss.next();

        System.out.print("Enter your Amount: ");
        int amount;
        amount = ss.nextInt();

        System.out.print("Enter your Email: ");
        String email;
        email = ss.next();

        this.handler.FormHandler(new CustomerInfo(number,amount,email));
    }
}
