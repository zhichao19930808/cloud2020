package xin.zcglory.springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xin.zcglory.springCloud.entity.CommonResult;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/findPaymentById/{id}")
    public CommonResult findPaymentById(@PathVariable(value = "id") long id);
}
