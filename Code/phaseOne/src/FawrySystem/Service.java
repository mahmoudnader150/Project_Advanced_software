package FawrySystem;

public abstract class Service {
    double percent;
    double cost;
    String description;
    ServiceProviderFactory obj;
    Discount discount;
    boolean state;
    double fees;
    public void pay(Payment payment){
        payment.pay(this.getCost());
    }

    public void setCost(double cost) {
        this.cost = cost+fees;
    }

    public abstract double getCost() ;

    public String getDescription(){
        return this.description;
    }

    Boolean hasDiscount(){return this.state;}

    void setDiscount(Boolean state){
        this.state = state;
    }

}
