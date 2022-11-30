package FawrySystem;

public class Service {
    String description;
    ServiceProvider obj;
    Service(ServiceProvider obj){
        this.obj = obj;
    }
    public String getDescription(){
        return this.description;
    }

}
