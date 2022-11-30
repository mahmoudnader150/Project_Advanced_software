package FawrySystem;

public class AddingService {
    public Service createService(ServiceProvider sp)
    {
        return new Service(sp);
    }
}
