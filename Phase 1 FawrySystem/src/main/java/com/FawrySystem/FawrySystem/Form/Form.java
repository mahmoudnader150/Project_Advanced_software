package com.FawrySystem.FawrySystem.Form;

import com.FawrySystem.FawrySystem.Customer.LoginController;
import com.FawrySystem.FawrySystem.myService.Models.Service;


public abstract class Form {
    LoginController loginController;
    IHandler handler = null;
    Form(IHandler handler){
        this.handler = handler;
    } // the form has handler to handle the input
    public abstract void showForm(Service service, int choice, double amount);
}
