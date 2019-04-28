package cn.zhangguimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.myrule.MyRibbonRule;


@SpringBootApplication //feign
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-EMPT", configuration = MyRibbonRule.class)
public class SpringBootWebApplication_80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication_80.class, args);
    }
}
