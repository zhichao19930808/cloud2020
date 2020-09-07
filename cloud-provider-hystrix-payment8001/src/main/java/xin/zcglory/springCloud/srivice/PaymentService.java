package xin.zcglory.springCloud.srivice;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String quick() {
        return "线程：" + Thread.currentThread().getName() + " quick --->哈哈";
    }

    public String slow() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程：" + Thread.currentThread().getName() + " slow --->哈哈";
    }


}
