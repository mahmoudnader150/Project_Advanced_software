package com.FawrySystem.FawrySystem.RefundRequest.Bsl;

import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.RefundRequest.Model.RefundRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MakingRequest {
    ArrayList<RefundRequest> refundRequests = new ArrayList<>();

    public ArrayList<RefundRequest> getRefundRequests() {
        return refundRequests;
    }


    public void addRequest(RefundRequest refundRequest) {
        refundRequests.add(refundRequest);
    }

    public String notifyRequest(Customer currentCustomer,RefundRequest refundRequest)
    {
        for (int i = 0; i < refundRequests.size(); i++)
        {
            if(refundRequests.get(i).getTransactionName().equals(refundRequest.getTransactionName()) && refundRequests.get(i).getAmount() == refundRequest.getAmount()) {
                refundRequests.get(i).update(currentCustomer,true);
                return "Refund request accepted";
            }
        }
        return "No refund request with this name";
    }
}
