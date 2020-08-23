package xin.zcglory.springCloud.service;

import org.apache.ibatis.annotations.Param;
import xin.zcglory.springCloud.entity.Payment;

public interface PaymentService {


    int insertPaymentDto(Payment payment);

    Payment findPaymentDtoById(@Param("id") Long id);

}
