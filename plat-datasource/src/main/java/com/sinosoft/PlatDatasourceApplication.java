package com.sinosoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@MapperScan("com.sinosoft.mapper")  //扫描mapper文件
public class PlatDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatDatasourceApplication.class, args);
    }

}
