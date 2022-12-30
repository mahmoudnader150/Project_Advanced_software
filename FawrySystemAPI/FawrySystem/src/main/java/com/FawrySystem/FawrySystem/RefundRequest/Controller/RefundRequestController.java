package com.FawrySystem.FawrySystem.RefundRequest.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Controller.CustomerController;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.RefundRequest.Bsl.CheckingRequest;
import com.FawrySystem.FawrySystem.RefundRequest.Bsl.MakingRequest;
import com.FawrySystem.FawrySystem.RefundRequest.Model.RefundRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/refund")
public class RefundRequestController {
    @Autowired
    CheckingRequest myRequest;
    @Autowired
    MakingRequest makingRequest;

    @Autowired
    CustomerController customerController;

    @GetMapping(value = "/{userName}/checkrefund")
    public String checkMyRequest(@PathVariable String userName) {
        Customer customer = customerController.getAccount(userName);
        return myRequest.checkMyRequest(customer);
    }

    @PostMapping(value = "/{userName}/makerefund")
    public String makeRefundRequest(@PathVariable String userName, @RequestBody HashMap<String, Object> Data) {
        Customer currrentCustomer = customerController.getAccount(userName);
        String transactionName = (String) Data.get("transactionName");
        double amount = (double) Data.get("amount");

        currrentCustomer.setRefundRequest(new RefundRequest(transactionName, amount));
        makingRequest.addRequest(currrentCustomer.getRefundRequest());

        return "Refund request is sent to the admin";
    }

}
