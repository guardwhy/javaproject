package cn.guardwhy_10;
/**
 线程休眠
 Thread.sleep(5000)：参数是毫秒，让当前所在线程对象休眠5s。
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        // 条件遍历
        for(int i=0; i<10; i++){
            System.out.println("输出:" + i);
            if(i == 5){
                try {
                    // 让当前线程休眠5s,休眠是不释放锁的。
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
