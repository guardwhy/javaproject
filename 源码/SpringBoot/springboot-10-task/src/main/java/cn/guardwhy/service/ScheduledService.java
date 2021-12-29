package cn.guardwhy.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    //秒   分   时     日   月   周几
    /*
    *  30 15 10 * *     每天10点15分30 执行一次
    *  30 0/5 10, 18 * *?   每天10点和18点，每隔五分钟执行一次
    * 0 15 10 ? * 1-6   每个月的周一到周六 10.15分钟执行一次
    */
    @Scheduled(cron = "0 * * * * 0-7")
    public void hello(){
        System.out.println("hello Springboot！！！");
    }
}
