package FawrySystem;

import java.text.Format;
import java.util.logging.Handler;

public class ServiceProvider {
    public Form f1;
    public Handler h1;
    public String name;
    ServiceProviderFactory serviceProviderFactory;
    ServiceProvider(String name){
        this.name=name;
    }

    public void setServiceProviderFactory(ServiceProviderFactory serviceProviderFactory) {
        this.serviceProviderFactory = serviceProviderFactory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
