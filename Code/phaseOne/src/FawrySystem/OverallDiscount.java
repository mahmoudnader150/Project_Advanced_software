package FawrySystem;

public class OverallDiscount extends Discount{


    OverallDiscount(Service service) {
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
        double overallCost = super.getCost();
        return overallCost-(this.percent*overallCost);
    }
}
