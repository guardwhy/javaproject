package cn.guardwhy_09;
/**
 存钱的线程类。
 */
public class SaveThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public SaveThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 3个爸爸来反复的存钱.
        while (true){
            try {
                // 线程休眠
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc.saveMoney(10000);
        }
    }
}
