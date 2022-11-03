package com.ykx.springcloud.service.impl;

import com.ykx.springcloud.dao.PaymentDao;

import com.ykx.springcloud.service.PaymentService;
import com.ykx.springclout.entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created on 2022/10/28.
 *
 * @author KaiXuan Yang
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
