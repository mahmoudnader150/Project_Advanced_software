package FawrySystem;

public class MobilRecharge extends Service{

    public MobilRecharge(double cost, String description) {
        this.cost = cost;
        this.description = description;
        this.fees = 7-2;
    }
    @Override
    public double getCost() {
        return cost+fees;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
