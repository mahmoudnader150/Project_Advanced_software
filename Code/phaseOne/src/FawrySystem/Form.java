package FawrySystem;

public abstract class Form {
    IHandler handler = null;
    Form(IHandler handler){
        this.handler = handler;
    } // the form has handler to handle the input
    public abstract void showForm(Service service);

}
