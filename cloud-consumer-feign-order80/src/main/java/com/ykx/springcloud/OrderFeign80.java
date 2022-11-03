package com.ykx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created on 2022/11/3.
 *
 * @author KaiXuan Yang
 */

@SpringBootApplication
@EnableFeignClients
public class OrderFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign80.class , args);
    }
}
