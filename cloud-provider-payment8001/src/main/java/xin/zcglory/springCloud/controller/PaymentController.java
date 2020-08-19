package xin.zcglory.springCloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import xin.zcglory.springCloud.entity.CommonResult;
import xin.zcglory.springCloud.entity.Payment;
import xin.zcglory.springCloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/payment/findPaymentById/{id}")
    public CommonResult<Payment> findPaymentById( @PathVariable long id) {
        CommonResult<Payment> commonResult = new CommonResult<Payment>();
        Payment payment = paymentService.findPaymentDtoById(id);

        if (payment == null) {
            commonResult.setCode(500);
            commonResult.setMessage("通过该id未查询到数据:" + id);
        } else {
            commonResult.setCode(200);
            commonResult.setMessage("查询成功");
            commonResult.setData(payment);

        }
        return commonResult;
    }
    @PostMapping(value = "/payment/insertPaymentDto")
    public CommonResult<Integer> insertPaymentDto(@RequestBody Payment payment) {
        CommonResult<Integer> commonResult = new CommonResult<>();

        int i = paymentService.insertPaymentDto(payment);

        if (i == 0) {
            commonResult.setCode(500);
            commonResult.setMessage("插入失败");
        } else {
            commonResult.setCode(200);
            commonResult.setMessage("插入成功");
            commonResult.setData(i);

        }
        return commonResult;
    }

}
