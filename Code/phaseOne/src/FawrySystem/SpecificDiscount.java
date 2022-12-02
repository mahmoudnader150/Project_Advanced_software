package FawrySystem;

public class SpecificDiscount extends Discount {

    SpecificDiscount(Service service) {
        super(service);
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setPercent(Double percent){
        this.percent = percent;
    }

    public static class CheckingAccount {
    }
    @Override
    public double getCost() {
        double overallCost = super.getCost();
        return overallCost-(this.percent*overallCost);
    }
}
