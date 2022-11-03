package com.ykx.springcloud.controller;

import com.ykx.springcloud.service.PaymentFeignService;
import com.ykx.springclout.entity.CommonResult;
import com.ykx.springclout.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created on 2022/11/3.
 *
 * @author KaiXuan Yang
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/cs")
    public String getTooLate(){
        return paymentFeignService.tooLate();
    }

}
