package cn.zhangguimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication //feign
@EnableEurekaClient
public class SpringBootWebApplication_80 {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication_80.class, args);
	}
}
