package FawrySystem;

public class LandlineServices extends Service{

    public LandlineServices(double cost, String description) {
        super(cost, description);
        this.fees = 2.1;
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
