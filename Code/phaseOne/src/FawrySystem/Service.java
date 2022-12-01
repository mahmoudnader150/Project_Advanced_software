package FawrySystem;

public abstract  class Service {
    Double cost;
    String description;
    ServiceProvider serviceProvider;

    Service(ServiceProvider serviceProvider,String name){
       serviceProvider = new ServiceProvider(name);
       this.serviceProvider = serviceProvider;
    }

    public String getDescription(){
        return this.description;
    }

}
