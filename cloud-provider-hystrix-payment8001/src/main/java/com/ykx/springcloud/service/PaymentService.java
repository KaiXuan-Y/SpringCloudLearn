package com.ykx.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2022/11/3.
 *
 * @author KaiXuan Yang
 */
@Service
public class PaymentService {
    /**
     * 正常访问肯定ok
     * @param id
     * @return
     */
    public String paymentInfo_Ok(Integer id){
        return "线程池："+Thread.currentThread().getName() + "paymentInfo_Ok,id:"+id;
    }

    //服务降级
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池："+Thread.currentThread().getName() + "paymentInfo_Timeout,id:"+id +  "  耗时2秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName() + "系统繁忙或者运行报错，请稍后再试,id:"+id + "：--0.0";
    }
}
