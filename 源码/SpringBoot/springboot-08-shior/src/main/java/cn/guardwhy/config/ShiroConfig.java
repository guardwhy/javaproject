package cn.guardwhy.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

// 声明为配置类
@Configuration
public class ShiroConfig {

    //3.创建ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        // 3.1设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        // 3.2添加shiro的内置过滤器
        /*
        * anon： 无需认证就可以访问
        * authc： 必须认证才可以访问
        * user： 如果使用了记住我功能就可以直接访问
        * perms: 拥有某个资源权限才可以访问
        * role： 拥有某个角色权限才可以访问
        */
        Map<String, String> filterMap = new LinkedHashMap<>();
        // 授权过滤器
        filterMap.put("/user/add", "perms[user:add]");
        filterMap.put("/user/update", "perms[user:update]");
        filterMap.put("/user/*","authc");

        bean.setFilterChainDefinitionMap(filterMap);
        // 3.3设置登录的请求
        bean.setLoginUrl("/toLogin");
        // 3.4 未授权页面
        bean.setUnauthorizedUrl("/noAuth");
        return bean;
    }

    //2.创建 DefaultWebSecurityManager
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 2.1关联UserRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    // 1.创建realm对象,需要自定义类
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }

    // 整合ShiroDialect:用来整合shiro thymeleaf
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
