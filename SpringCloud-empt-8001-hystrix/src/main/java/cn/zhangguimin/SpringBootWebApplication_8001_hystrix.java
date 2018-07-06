package cn.zhangguimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringBootWebApplication_8001_hystrix {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication_8001_hystrix.class, args);
	}
}
