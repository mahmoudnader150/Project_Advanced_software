package com.FawrySystem.FawrySystem.myService.Models;

import com.FawrySystem.FawrySystem.Form.Form;
import com.FawrySystem.FawrySystem.Form.WeForm;
import com.FawrySystem.FawrySystem.Form.WeHandler;

public class We extends ServiceProviderFactory {
    public We(String name){
        super(name);
    }

    @Override
    public Form createForm() {
        return new WeForm(new WeHandler());
    }
}
