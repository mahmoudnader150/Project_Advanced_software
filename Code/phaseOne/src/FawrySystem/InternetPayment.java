package FawrySystem;

public class InternetPayment extends Service{

    public InternetPayment(double cost, String description) {
        super(cost, description);
        this.fees = 3.0;
    }

    @Override
    public double getCost() {
        return cost+fees;
    }

    public String getDescription() {
        return super.getDescription();
    }
}
