package com.ykx.springcloud.service;


import com.ykx.springclout.entity.Payment;
import org.springframework.stereotype.Service;

/**
 * Created on 2022/10/28.
 *
 * @author KaiXuan Yang
 */

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
