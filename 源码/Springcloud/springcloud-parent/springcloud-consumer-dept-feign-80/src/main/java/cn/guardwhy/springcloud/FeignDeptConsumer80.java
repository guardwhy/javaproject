package cn.guardwhy.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.guardwhy.springcloud"})
public class FeignDeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer80.class,args);
    }
}
