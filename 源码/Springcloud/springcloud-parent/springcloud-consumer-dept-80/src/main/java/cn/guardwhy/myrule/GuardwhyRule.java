package cn.guardwhy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GuardwhyRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule(); // Ribbon默认是轮询，自定义随机算法
    }
}
