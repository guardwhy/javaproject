package cn.guardwhy_09;
/**
 取钱的线程类。
 */
public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // curry和james来取钱
        while (true){
            // 线程休眠
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 去账户acc中取钱
            acc.drawMoney(10000);
        }

    }
}
