package FawrySystem;
import java.util.ArrayList;

public class Admin {
    public String userName, password, email;
    public ArrayList<RefundRequest> refundRequests;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addRefundRequest(RefundRequest rf)
    {
        refundRequests.add(rf);
    }
    public void notifyRequests()
    {
        for (int i = 0; i <refundRequests.size(); i++)
        {
            boolean state = false;
            refundRequests.get(i).update(state);
        }
    }
}