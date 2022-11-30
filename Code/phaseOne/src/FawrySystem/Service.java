package FawrySystem;

public class Service {
    String discription;
    ServiceProvider obj;
    Service(ServiceProvider obj){
        this.obj = obj;
    }
    public String getDiscription(){
        return this.discription;
    }

}
