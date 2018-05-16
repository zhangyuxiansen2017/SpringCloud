package cn.zhangguimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootWebApplication_7001 {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication_7001.class, args);
	}
}
