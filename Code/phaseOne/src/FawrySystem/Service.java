package FawrySystem;

public abstract class Service {
    double cost;
    String description;
    ServiceProviderFactory obj;
    Discount discount;
    double fees;
    Service(/*ServiceProvider obj*/ double cost, String description){
        this.cost = cost;
        this.description = description;
//        this.obj = obj;
    }
    public void pay(Payment payment){
        payment.pay(cost);
    }

    public void setCost(double cost) {
        this.cost = cost+fees;
    }

    public abstract double getCost() ;

    public String getDescription(){
        return this.description;
    }

    Boolean hasDiscount(){return this.discount.state;}

}
