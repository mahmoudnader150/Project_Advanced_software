package FawrySystem;

public class CustomerController {

    public Payment setPaymentMethod(int choice){
        if(choice==1){
            return new CreditCardPayment();
        }
        else{
            return new CashPayment();
        }
    }
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
