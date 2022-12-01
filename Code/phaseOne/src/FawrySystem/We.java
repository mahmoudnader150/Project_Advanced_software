package FawrySystem;

public class We implements ServiceProviderFactory{
    @Override
    public Form createForm() {
        return new WeForm();
    }

    @Override
    public Handler createHandler() {
        return new WeHandler();
    }
}
