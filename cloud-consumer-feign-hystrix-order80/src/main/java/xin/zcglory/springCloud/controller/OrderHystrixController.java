package xin.zcglory.springCloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    @HystrixCommand(fallbackMethod = "slowFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String slow(){
        String result = paymentService.slow();
        log.info("*******result:"+result);
        return result;
    }

    //兜底方法
    public String slowFallbackMethod(){
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }
}
