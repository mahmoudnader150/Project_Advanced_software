package FawrySystem;

public abstract class Discount extends Service {


    public Service service;
    public Discount(Service s1) {

        this.service = s1;
    }


    public double getCost(){

        return service.getCost();
    }
    public String getDescription() {
        return description;
    }

    abstract public void setDescription(String description) ;


    public Double getPercent() {
        return this.getCost();
    }

    abstract public void setPercent(Double percent);
}
