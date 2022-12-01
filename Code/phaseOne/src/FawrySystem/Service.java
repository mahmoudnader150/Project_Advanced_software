package FawrySystem;

public abstract class Service {
    Double cost;
    String description;
    ServiceProvider obj;
    Discount discount;
    Service(ServiceProvider obj){
        this.obj = obj;
    }



    public String getDescription(){
        return this.description;
    }

    Boolean hasDiscount(){return this.discount.state;}

}
