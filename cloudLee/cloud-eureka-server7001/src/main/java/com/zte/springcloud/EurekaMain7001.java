package com.zte.springcloud;/**
 * @Theme:
 * @Description:
 * @Author:liyadong
 * @Date:2020/7/26 0026 14:39
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaMain7001
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/26 0026 14:39
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);

    }
}
