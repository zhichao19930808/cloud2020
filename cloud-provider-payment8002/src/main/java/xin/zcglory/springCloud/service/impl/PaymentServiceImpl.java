package xin.zcglory.springCloud.service.impl;

import org.springframework.stereotype.Service;
import xin.zcglory.springCloud.dao.PaymentMapper;
import xin.zcglory.springCloud.entity.Payment;
import xin.zcglory.springCloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentMapper paymentMapper;

    @Override
    public int insertPaymentDto(Payment payment) {
        return paymentMapper.insertPaymentDto(payment);
    }

    @Override
    public Payment findPaymentDtoById(Long id) {
        return paymentMapper.findPaymentDtoById(id);
    }
}
