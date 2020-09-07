package xin.zcglory.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.zcglory.springCloud.srivice.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @GetMapping(value = "payment/hystrix/quick")
    public String quick() {
        return paymentService.quick();
    }
    @GetMapping(value = "payment/hystrix/slow")
    public String slow() {
        return paymentService.slow();
    }

}
