package cn.zhangguimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.zhangguimin"})
@ComponentScan("cn.zhangguimin")
public class SpringBootWebApplication_80_feign {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication_80_feign.class, args);
    }
}
