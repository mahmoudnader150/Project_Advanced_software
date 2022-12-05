package FawrySystem;

public class SpecificDiscount extends Discount {

    SpecificDiscount(Service service) {
        super(service);
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setPercent(Double percent) {
        this.percent = percent;
    }

    @Override
    public double getCost() {
        double overallCost = service.getCost();
        String.format("%.5f", overallCost);
        return overallCost - (0.3 * overallCost);
    }
}
