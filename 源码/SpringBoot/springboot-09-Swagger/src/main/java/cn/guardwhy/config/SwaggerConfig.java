package cn.guardwhy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration // 配置类
@EnableSwagger2 // 开启Swagger2的自动配置
public class SwaggerConfig {
    // 1.配置了Swagger的Docket的bean实例
    @Bean
    public Docket docket(Environment environment){
        // 1.设置要显示Swagger的环境
        Profiles profiles = Profiles.of("dev","test");
        // 2.通过environment.acceptsProfiles 判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("hello")
                .enable(flag) // enable是否启动Swagger，如果为False,则Swagger不能再浏览器中的访问！！
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.guardwhy.controller"))
                // 配置如何通过path过滤,即这里只扫描请求以/guardwhy开头的接口
                .paths(PathSelectors.ant("/guardwhy/**"))
                .build();
    }

    // 2.配置Swagger信息=apiInfo
    private ApiInfo apiInfo() {
        // 2.1 作者信息
        Contact contact = new Contact("guardwhy", "https://home.cnblogs.com/u/Guard9/","hxy1625309592@aliyun.com");
        return new ApiInfo(
                "学习记录总结!!!",
                "好好学习，天天向上！！",
                "1.0",
                "urn:tos",
                 contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }

    // 3.配置多个分组
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group1");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
    }

    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
    }
}
