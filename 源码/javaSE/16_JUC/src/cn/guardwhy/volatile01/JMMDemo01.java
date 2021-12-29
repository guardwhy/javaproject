package cn.guardwhy.volatile01;

import java.util.concurrent.TimeUnit;

/*
* JMM内存模型
*/
public class JMMDemo01 {
    private static int num = 0;
    public static void main(String[] args) { // 线程1(main线程)
        new Thread(()->{ // 线程2
            while (num == 0){

            }
        }).start();

        try {
            // 休眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num = 1;
        System.out.println("num的值:" + num);
    }
}
