
package com.FawrySystem.FawrySystem.AdminLogin.Model;


import com.FawrySystem.FawrySystem.RefundRequest.Model.RefundRequest;

import java.util.ArrayList;

public class Admin {
    public String userName, password, email;
    public ArrayList<RefundRequest> refundRequests;

    public Admin(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

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
}