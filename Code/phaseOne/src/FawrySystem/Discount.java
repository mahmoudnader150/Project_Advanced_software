package FawrySystem;

public abstract class Discount {
    public String description;
    public Double percent;

    public String getDescription() {
        return description;
    }

    abstract public void setDescription(String description) ;

    public Double getPercent() {
        return percent;
    }

    abstract public void setPercent(Double percent);
}
