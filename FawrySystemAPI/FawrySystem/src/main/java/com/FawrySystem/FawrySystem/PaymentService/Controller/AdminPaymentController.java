package com.FawrySystem.FawrySystem.PaymentService.Controller;

import com.FawrySystem.FawrySystem.PaymentService.Bsl.PaymentBsl;
import com.FawrySystem.FawrySystem.PaymentService.Model.PaymentTransaction;
import com.FawrySystem.FawrySystem.RefundRequest.Controller.AdminRefundRequestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class AdminPaymentController {

    @Autowired
    PaymentBsl paymentBsl;

    @GetMapping(value = "/getPaymentTransactions")
    public ArrayList<PaymentTransaction> getPaymentTransction()
    {
        return paymentBsl.getPaymentTransaction();
    }

}
