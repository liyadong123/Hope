package com.zte.springcloud;/**
 * @Theme:
 * @Description:
 * @Author:liyadong
 * @Date:2020/7/15 0015 21:42
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain80
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/15 0015 21:42
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
