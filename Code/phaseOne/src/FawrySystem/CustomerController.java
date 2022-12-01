package FawrySystem;

public class CustomerController {
    public ServiceProviderFactory ServiceProviderFactory(String choice)
    {
        if(choice .equals( "Vodafone"))
        {
            return new Vodafone();
        }
        else if(choice.equals("We"))
        {
            return new We();
        }
        return null;
    }
}
