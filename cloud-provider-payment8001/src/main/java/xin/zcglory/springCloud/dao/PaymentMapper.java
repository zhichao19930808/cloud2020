package xin.zcglory.springCloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xin.zcglory.springCloud.entity.Payment;

@Mapper
public interface PaymentMapper {

    int insertPaymentDto(Payment payment);

    Payment findPaymentDtoById(@Param("id") Long id);
}
