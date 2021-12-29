package cn.guardwhy.controller;

import cn.guardwhy.dao.CustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 客户controller
 */
public class CustomerController {
    public static void main(String[] args) {
        /*// 1.创建spring IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2.实例工厂方法实例化对象
        CustomerDao instanceDao = (CustomerDao) context.getBean("instanceDao");
        // 3.保存用户
        instanceDao.saveCustomer();*/
        // 1.加载spring配置文件，创建ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2.获取两次dao对象,检查是否是同一个对象
        CustomerDao customerDao1 = (CustomerDao) context.getBean("customerDao");
        CustomerDao customerDao2 = (CustomerDao) context.getBean("customerDao");
        System.out.println(customerDao1 == customerDao2);
        // 3.条件判断
        System.out.println(customerDao1.hashCode());
        System.out.println(customerDao2.hashCode());
        // customerDao1.saveCustomer();
    }
}
