package FawrySystem;

public abstract class Service {
    Double cost;
    String description;
    ServiceProvider obj;
    Discount discount;
    Service(/*ServiceProvider obj*/ double cost, String description){
        this.cost = cost;
        this.description = description;
//        this.obj = obj;
    }



    public String getDescription(){
        return this.description;
    }

    Boolean hasDiscount(){return this.discount.state;}

}
