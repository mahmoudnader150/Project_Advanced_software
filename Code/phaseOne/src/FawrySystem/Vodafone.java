package FawrySystem;

public class Vodafone implements ServiceProviderFactory{
    @Override
    public Form createForm() {
        return new VodafoneForm();
    }

    @Override
    public Handler createHandler() {
        return new VodafoneHandler() {
        };
    }
}
