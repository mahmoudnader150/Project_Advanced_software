package FawrySystem;

public class We extends ServiceProviderFactory{

    We(String name){
       super(name);
    }

    @Override
    public Form createForm() {
        return new WeForm(new WeHandler());
    }

}
