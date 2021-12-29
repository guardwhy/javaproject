package cn.guardwhy.controller;

import cn.guardwhy.config.SpringConfiguration;
import cn.guardwhy.domain.Customer;
import cn.guardwhy.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 客户表现层
 */
public class CustomerController {
    public static void main(String[] args) {
        // 1.如果完全使用了配置类方式去做，只能通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载。
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2.获取客户service对象
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        // 3.查询全部客户列表数据
        List<Customer> list = customerService.findAllCustomers();
        // 4.遍历操作
        for(Customer customer : list){
            System.out.println(customer);
        }
    }
}
