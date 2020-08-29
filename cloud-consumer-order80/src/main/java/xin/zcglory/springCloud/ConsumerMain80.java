package xin.zcglory.springCloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import xin.zcglory.myrule.MySelfRule;

@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class ConsumerMain80 {


    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain80.class, args);
    }
}
