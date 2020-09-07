package xin.zcglory.springCloud.srivice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class PaymentService {

    public String quick() {
        return "线程：" + Thread.currentThread().getName() + " quick --->哈哈";
    }

    public String slow() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("aaaaaaaaaaaaaaa");
        return "线程：" + Thread.currentThread().getName() + " slow --->哈哈";
    }


}
