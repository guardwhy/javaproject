package cn.guardwhy.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async  // 告诉Spring这是一个异步方法
    public void hello(){

        try {
            // 休眠3秒
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 输出结果
        System.out.println("数据处理中.....");
    }
}
