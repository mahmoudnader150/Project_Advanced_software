package FawrySystem;

public abstract class Discount extends Service {


    public Service service;
    protected Double percent;

    public Discount(Service s1) {
        s1.state = true;
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
