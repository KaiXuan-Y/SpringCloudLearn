package com.ykx.springcloud;

import com.ykx.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created on 2022/10/28.
 *
 * @author KaiXuan Yang
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class  OrderMain80 {
    public static  void main(String[] args) {
        SpringApplication.run(OrderMain80.class ,args);
    }

}


