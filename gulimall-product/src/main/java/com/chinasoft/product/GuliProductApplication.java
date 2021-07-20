package com.chinasoft.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: vanceChen
 * @Date: 2021/7/19 17:17
 * @Descript:
 */
@EnableDiscoveryClient
@MapperScan("com.chinasoft.product.dao")
@SpringBootApplication // (exclude = GlobalTransactionAutoConfiguration.class)
public class GuliProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliProductApplication.class, args);
    }

}
