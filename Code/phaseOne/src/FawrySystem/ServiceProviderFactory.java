package FawrySystem;



public abstract class ServiceProviderFactory {
    public Form form;
    public String name;

    ServiceProviderFactory(String name){
        this.name=name;
    }
    public abstract Form createForm() ;
//    public abstract IHandler createHandler();

    public void setForm(Service service){
        form = createForm();
        this.form.showForm(service);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
