package cn.guardwhy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Configuration:这个也会交给Spring容器托管，注册到容器中。因为他本来就是一个@Component
 * 它代表一个配置类，就和我们之前看到的beans.xml
 */
@Configuration
@ComponentScan(value = {"cn.guardwhy"}) // @ComponentScan：配置扫描包。相当于xml配置中<context:component-scan/>标签
public class SpringConfiguration {
    /**
     *  @Bean: 注册一个bean,就相当于xml的一个bean标签。
     *  这个方法的名字，相当于bean标签中的id属性。
     *  这个方法的返回值，就相当于bean标签中的class属性。
     */
    @Bean(value = "jdbcTemplate")
    public JdbcTemplate  createJdbcTemplate(DataSource dataSource){
        // 创建JbdcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;   // 就是返回要注入到bean的对象中
    }

    /**
     * 配置数据源对象DateSource
     */
    @Bean(value = "dataSource")
    public DataSource createDataSource(){
        // 创建DataSource
        DruidDataSource dataSource = new DruidDataSource();
        // 注入属性
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        dataSource.setInitialSize(6);
        dataSource.setMinIdle(3);
        dataSource.setMaxActive(50);
        dataSource.setMaxWait(60000);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        return dataSource;
    }
}
