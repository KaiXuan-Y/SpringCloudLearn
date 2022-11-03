package com.ykx.springcloud.controller;

import com.ykx.springcloud.service.PaymentService;
import com.ykx.springclout.entity.CommonResult;
import com.ykx.springclout.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created on 2022/10/28.
 *
 * @author KaiXuan Yang
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int res = paymentService.create(payment);
        log.info("****插入结果：" + res);
        if (res > 0){
            return new CommonResult(200,"插入数据库成功,serverPort"+serverPort,res);
        }else {
            return new CommonResult(404,"插入数据库失败",null);

        }
    }

    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果："+payment);
        if (payment != null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,payment);
        }else {
            return new CommonResult(404,"查询失败",null);

        }
    }
}
