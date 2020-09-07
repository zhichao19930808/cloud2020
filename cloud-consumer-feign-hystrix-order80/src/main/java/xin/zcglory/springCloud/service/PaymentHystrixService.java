package xin.zcglory.springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentHystrixService {


    @GetMapping(value = "payment/hystrix/quick")
    public String quick() ;
    @GetMapping(value = "payment/hystrix/slow")
    public String slow() ;
}
