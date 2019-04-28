package cn.zhangguimin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

//boot -->spring applicationContext.xml --- @Configuration配置 ConfigBean =applicationContext.xml
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}

// @Bean
// public UserServcie getUserServcie()
// {
// return new UserServcieImpl();
// }
// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">