package cn.guardwhy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot10TaskApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads1() {
        // 1.一个简单的邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("hello Springboot!!!");
        mailMessage.setText("Springboot源码分析");

        // 发送
        mailMessage.setTo("1625309592@qq.com");
        mailMessage.setFrom("1625309592@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {
        // 1.一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 2.组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 正文
        helper.setSubject("hello Springboot!!!");
        helper.setText("Springboot源码分析");

        // 附件
        helper.addAttachment("my.jpg", new File("C:\\Users\\linux\\Pictures\\my.jpg"));
        helper.addAttachment("timg.jpg", new File("C:\\Users\\linux\\Pictures\\timg.jpg"));

        // 发送
        helper.setTo("1625309592@qq.com");
        helper.setFrom("1625309592@qq.com");

        mailSender.send(mimeMessage);
    }

}
