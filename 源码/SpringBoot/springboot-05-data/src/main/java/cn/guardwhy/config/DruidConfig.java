package cn.guardwhy.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 将自定义的Druid数据源添加到容器中
@Configuration
public class DruidConfig {
    //将全局配置文件中前缀为 spring.datasource的属性值注入到 com.alibaba.druid.pool.DruidDataSource的同名参数中
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    // 后台监控
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new
                StatViewServlet(), "/druid/*");
        // 后台需要有人登陆，账号密码配置
        HashMap<String, String> initParameters = new HashMap<>();
        // 3.增加配置
        initParameters.put("loginUsername","admin"); // 后台管理界面的登录账号
        initParameters.put("loginPassword", "123456"); // 后台管理界面的登录密码
        // 4.允许谁可以访问
        initParameters.put("allow", "");

        // 表示禁止该ip地址访问
        // initParameters.put("guardwhy","192.168.3.8");

        // 5.设置初始化参数
        bean.setInitParameters(initParameters);
        return bean;
    }

    // 过滤器
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        // 可以过滤哪些请求
        Map<String, String> initParams = new HashMap<>();
        // 这些东西不进行统计
        initParams.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        return bean;
    }
}
