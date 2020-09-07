package xin.zcglory.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.zcglory.springCloud.service.PaymentHystrixService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentService;

    @GetMapping(value = "/consumer/payment/hystrix/quick")
    public String quick(){
        String result = paymentService.quick();
        log.info("*******result:"+result);
        return result;
    }
    @GetMapping(value = "/consumer/payment/hystrix/slow")
    public String slow(){
        String result = paymentService.slow();
        log.info("*******result:"+result);
        return result;
    }


}
