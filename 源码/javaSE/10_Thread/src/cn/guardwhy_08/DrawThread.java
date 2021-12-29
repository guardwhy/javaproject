package cn.guardwhy_08;

/**
 *  取钱的线程类
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
        // 去账户acc中取钱
        acc.drawMoney(10000);
    }
}
