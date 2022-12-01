package FawrySystem;

public abstract class Discount {
    public String description;
    public Double percent;
    public Boolean state;

    Discount(){
       this.state = false;
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
