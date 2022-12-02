package FawrySystem;



public abstract class ServiceProviderFactory {
    public Form f1;
    //public IHandler h1;
    public String name;

    ServiceProviderFactory(String name){
        this.name=name;
    }
    public abstract Form createForm() ;
//    public abstract IHandler createHandler();

    public void setForm(Service service){
        f1 = createForm();
        this.f1.showForm(service);
//        h1 = createHandler();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
