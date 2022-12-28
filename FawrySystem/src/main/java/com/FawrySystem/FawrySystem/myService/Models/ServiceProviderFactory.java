package com.FawrySystem.FawrySystem.myService.Models;

import com.FawrySystem.FawrySystem.Form.Form;

public abstract class ServiceProviderFactory {
    public Form form;
    public String name;

    ServiceProviderFactory(String name){
        this.name=name;
    }
    public abstract Form createForm() ;
//    public abstract IHandler createHandler();

    public void setForm(Service service, int choice, double amount){
        form = createForm();
        this.form.showForm(service, choice, amount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
