package xin.zcglory.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xin.zcglory.springCloud.entity.CommonResult;
import xin.zcglory.springCloud.service.PaymentFeignService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/openFeign/payment/findPaymentById/{id}")
    public CommonResult findPaymentById(@PathVariable long id) {
        return paymentFeignService.findPaymentById(id);
    }

}
