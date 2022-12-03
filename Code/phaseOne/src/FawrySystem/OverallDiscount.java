package FawrySystem;

public class OverallDiscount extends Discount{


    public OverallDiscount(Service service) {
        super(service);
    }

    public void setDescription(String description) {
       this.description = description;
    }


    public void setPercent(Double percent){
         this.percent = percent;
    }

    @Override
    public double getCost() {
        double overallCost = service.getCost();
        return (overallCost-(0.1*overallCost));
    }
}
