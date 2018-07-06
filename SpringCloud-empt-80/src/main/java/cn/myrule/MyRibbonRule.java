package cn.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MyRibbonRule {
	
	@Bean
	public IRule myRule() {
		return new RandomRule_ZGM();
	}
}