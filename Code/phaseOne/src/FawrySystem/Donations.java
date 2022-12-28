package FawrySystem;

public class Donations extends Service {

    public Donations(double codst, String description) {
        this.cost = cost;
        this.description = description;
        this.fees = 4.3;
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
