package cn.guardwhy.Test;

import cn.guardwhy.pojo.Books;
import cn.guardwhy.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        // 遍历操作
        for(Books books : bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
