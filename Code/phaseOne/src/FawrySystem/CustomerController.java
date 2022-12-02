package FawrySystem;

public class CustomerController {
    public ServiceProviderFactory serviceProviderFactory(String choice)
    {
        if(choice.equals( "Vodafone"))
        {
            return new Vodafone("Vodafone");
        }
        else if(choice.equals("We"))
        {
            return new We("We");
        }
        return null;
    }
}
