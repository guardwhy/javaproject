package cn.guardwhy.volatile01;
import java.util.concurrent.TimeUnit;
/*
 保证可见性
*/
public class VolatileDemo01 {
    // 不加 volatile程序会出现死循环,加上volatile可以保证可见性。
    private volatile static int num = 0;

    public static void main(String[] args) {
        new Thread(()->{ // 线程2对主内存的变化不知道
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
