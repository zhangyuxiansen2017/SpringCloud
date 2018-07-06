package cn.zhangguimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringBootWebApplication_9001 {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication_9001.class, args);
	}
}
