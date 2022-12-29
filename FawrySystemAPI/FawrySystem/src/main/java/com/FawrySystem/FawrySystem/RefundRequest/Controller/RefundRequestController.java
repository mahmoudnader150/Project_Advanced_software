package com.FawrySystem.FawrySystem.RefundRequest.Controller;

import com.FawrySystem.FawrySystem.CustomerLogin.Controller.CustomerController;
import com.FawrySystem.FawrySystem.CustomerLogin.Model.Customer;
import com.FawrySystem.FawrySystem.RefundRequest.Bsl.CheckMyRequest;
import com.FawrySystem.FawrySystem.RefundRequest.Bsl.MakeRefund;
import com.FawrySystem.FawrySystem.RefundRequest.Model.RefundRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/refund")
public class RefundRequestController {
    @Autowired
    CheckMyRequest myRequest;
    @Autowired
    MakeRefund makeRefund;

    @Autowired
    CustomerController customerController;

    @GetMapping(value = "/{userName}/checkrefund")
    public String checkMyRequest(@PathVariable String userName) {
        Customer customer = customerController.getAccount(userName);
        return myRequest.CheckMyRequest(customer);
    }

    @PostMapping(value = "/{userName}/makerefund")
    public String makeRefundRequest(@PathVariable String userName, @RequestBody HashMap<String, Object> Data) {
        Customer currrentCustomer = customerController.getAccount(userName);
        String transactionName = (String) Data.get("transactionName");
        double amount = (double) Data.get("amount");

        currrentCustomer.setRefundRequest(new RefundRequest(transactionName, amount));
        makeRefund.addRequest(currrentCustomer.getRefundRequest());

        return "Refund request is sent to the admin";
    }

}
