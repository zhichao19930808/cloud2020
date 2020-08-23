package xin.zcglory.springCloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xin.zcglory.springCloud.entity.CommonResult;
import xin.zcglory.springCloud.entity.Payment;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/findPaymentById/{id}")
    public CommonResult findPaymentById(@PathVariable long id) {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/findPaymentById/"+id,CommonResult.class);
    }
    @GetMapping(value = "/consumer/payment/insertPaymentDto")
    public CommonResult insertPaymentDto(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/insertPaymentDto",payment,CommonResult.class);
    }

}
