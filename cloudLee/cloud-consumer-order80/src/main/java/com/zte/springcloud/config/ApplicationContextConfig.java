package com.zte.springcloud.config;/**
 * @Theme:
 * @Description:
 * @Author:liyadong
 * @Date:2020/7/15 0015 22:05
 */

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/15 0015 22:05
 * @Version V1.0
 **/
@Configuration
public class ApplicationContextConfig {
    /**
      * @Method: 基于注解配置RestTemplate
      * $Param []
      * $Return org.springframework.web.client.RestTemplate
      * @Description TODO
      * @Auther liyadong
      * @Date  
      **/
    @Bean
    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
