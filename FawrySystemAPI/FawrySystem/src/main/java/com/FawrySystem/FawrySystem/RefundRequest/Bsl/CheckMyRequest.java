package com.FawrySystem.FawrySystem.RefundRequest.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CheckMyRequest {
    public String CheckMyRequest(Customer currentCustomer) {
        if(currentCustomer.getRefundRequest() == null)
        {
            return "No refund request found";
        }
        if (currentCustomer.getRefundRequest().isState() == true) // isState == true iff the customer's request is accepted
        {                                                  // from the admin
            return "Accepted";
        } else {
            return "Denied";
        }
    }
}
