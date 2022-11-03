package com.ykx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created on 2022/11/2.
 *
 * @author KaiXuan Yang
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumer80.class , args);
    }
}
