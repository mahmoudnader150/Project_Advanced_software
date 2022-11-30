package FawrySystem;

public class RefundRequest {
    public boolean state;
    public RefundRequest()
    {
        state = false;
    }
    public void update(boolean state)
    {
        this.state = state;
    }
}
