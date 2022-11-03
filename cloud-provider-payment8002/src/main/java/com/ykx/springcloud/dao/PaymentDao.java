package com.ykx.springcloud.dao;


import com.ykx.springclout.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created on 2022/10/26.
 *
 * @author KaiXuan Yang
 */
@Mapper
public interface PaymentDao {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
