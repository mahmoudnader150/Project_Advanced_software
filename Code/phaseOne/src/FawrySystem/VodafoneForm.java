package FawrySystem;

import java.util.Scanner;

public class VodafoneForm extends Form{

    VodafoneForm(IHandler handler) {
        super(handler);
    }

    @Override
    public void showForm() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Vodafone Form");
        System.out.println("--------------");
        System.out.print("Enter your Mobile Number: ");
        String number;
        number = ss.next();
        System.out.print("Enter your Amount: ");
        int amount;
        amount = ss.nextInt();

        this.handler.FormHandler(new CustomerInfo(number,amount));
    }
}
