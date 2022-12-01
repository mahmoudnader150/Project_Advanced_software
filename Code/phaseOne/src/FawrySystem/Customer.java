package FawrySystem;

public class Customer {
    public String userName, email, password;
    public Wallet wallet;
    public Payment p1 ;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName, Payment p1) {
        this.userName = userName;
        this.p1 = p1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setP1(Payment p1) {
        this.p1 = p1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
