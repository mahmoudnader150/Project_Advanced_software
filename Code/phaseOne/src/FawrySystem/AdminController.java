package FawrySystem;

public class AdminController {
    public void checkRequest()
    {
        System.out.println("The refund request list");
        System.out.println("1- Accepted");
        System.out.println("2- Rejected");
        Main.entity.notifyRequest();
    }
}
