package FawrySystem;

public abstract class Form {
    IHandler handler = null;
    Form(IHandler handler){
        this.handler = handler;
    }
    public abstract void showForm(Service service);

}
