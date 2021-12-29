package cn.guardwhy_07;
/**
 同步方法：
 思想：把"出现线程安全问题的核心方法"给锁起来,每次只能进入一个线程，
 其他线程必须在外面等这个线程执行完毕以后，才能进入执行，这样就线程安全了。
 只需要在方法上加上一个 synchronized 关键字即可！

 原理：同步方法的原理与同步代码块的原理是一样的，只是同步方法是把整个方法体代码都锁起来，同步方法默认也是有锁对象的。
 如果同步的方法是实例方法，默认用this作为锁对象。如果同步的方法是静态方法，默认用类名.class作为锁对象。
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
