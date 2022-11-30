package FawrySystem;

public class Service {
    String discription;
    ServiceProvider obj;
    Service(ServiceProvider obj){
        this.obj = obj;
    }
    String getDiscription(){
        return this.discription;
    }

}
