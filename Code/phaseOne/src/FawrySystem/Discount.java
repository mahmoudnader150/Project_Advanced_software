package FawrySystem;

public abstract class Discount extends Service {
    public String description;
    public Double percent;
    public Boolean state;
    public Service service;

    public Discount(Service service){
       this.state = false;
       this.service = service;
    }
    public double getCost(){
        return service.getCost();
    }
    public String getDescription() {
        return description;
    }

    abstract public void setDescription(String description) ;


    public Double getPercent() {
        return percent;
    }

    abstract public void setPercent(Double percent);
}
