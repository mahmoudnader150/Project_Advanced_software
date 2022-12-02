package FawrySystem;

public class Vodafone extends ServiceProviderFactory {

    Vodafone(String name){
       super(name);
    }

    @Override
    public Form createForm() {
        return new VodafoneForm(new VodafoneHandler());
    }

   /* @Override
    public IHandler createHandler() {
        return new VodafoneHandler();
    }*/
}
