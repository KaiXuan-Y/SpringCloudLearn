package com.ykx.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created on 2022/11/3.
 *
 * @author KaiXuan Yang
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "-----PaymentFallbackService fall back_info_Ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back_info_Timeout";
    }
}
