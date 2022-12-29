package com.FawrySystem.FawrySystem.RefundRequest.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Controller.CustomerController;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.RefundRequest.Bsl.MakeRefund;
import com.FawrySystem.FawrySystem.RefundRequest.Model.RefundRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "/admin")
public class AdminRefundRequestController {

    @Autowired
    MakeRefund makeRefund;

    @Autowired
    CustomerController customerController;
    @PutMapping(value = "/{userName}/requestreply")
    public String RequestReply(@PathVariable String userName, @RequestBody RefundRequest refundRequest)
    {
        Customer currentCustomer= customerController.getAccount(userName);
        return makeRefund.notifyRequest(currentCustomer, refundRequest);
    }

    @GetMapping(value = "/getrefundrequests")
    public ArrayList<RefundRequest> GetRefundRequests()
    {
        return makeRefund.getRefundRequests();
    }
}
