package com.FawrySystem.FawrySystem.myService.Models;

import com.FawrySystem.FawrySystem.Form.Form;
import com.FawrySystem.FawrySystem.Form.VodafoneForm;
import com.FawrySystem.FawrySystem.Form.VodafoneHandler;
import com.FawrySystem.FawrySystem.myService.Models.ServiceProviderFactory;

public class Vodafone extends ServiceProviderFactory {
    public Vodafone(String name){
        super(name);
    }

    @Override
    public Form createForm() {
        return new VodafoneForm(new VodafoneHandler());
    }
}
