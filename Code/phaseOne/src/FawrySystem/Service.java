package FawrySystem;

public abstract class Service {
    Double cost;
    String description;
    ServiceProvider obj;
    Service(ServiceProvider obj){
        this.obj = obj;
    }
    public String getDescription(){
        return this.description;
    }

}
