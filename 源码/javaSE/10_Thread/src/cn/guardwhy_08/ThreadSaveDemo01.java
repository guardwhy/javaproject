package cn.guardwhy_08;
/**
 Lock锁
     java.util.concurrent.locks.Lock
     Lock锁也称同步锁，加锁与释放锁方法如下：
     - public void lock() :加同步锁。
     - public void unlock():释放同步锁。
 */
public class ThreadSaveDemo01 {
    public static void main(String[] args) {
        // 1.创建一个共享资源:是一个账户对象,这个对象必须只有一个。
        Account acc = new Account("ICBC-162", 10000);
        // 创建2个线程对象代表curry和james
        DrawThread curry = new DrawThread("curry", acc);
        // 启动线程
        curry.start();

        DrawThread james = new DrawThread("james", acc);
        // 启动线程
        james.start();
    }
}
