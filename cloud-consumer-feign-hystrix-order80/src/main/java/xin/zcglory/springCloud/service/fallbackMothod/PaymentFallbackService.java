package xin.zcglory.springCloud.service.fallbackMothod;

import org.springframework.stereotype.Component;
import xin.zcglory.springCloud.service.PaymentHystrixService;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String quick() {
        return "-----quick()服务异常";

    }

    @Override
    public String slow() {
        return "-----slow()服务异常";

    }
}
