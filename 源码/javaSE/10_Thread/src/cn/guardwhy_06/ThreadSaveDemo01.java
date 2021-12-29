package cn.guardwhy_06;
/**
 线程出现安全问题的核心原因：多个线程操作同一个共享资源的时候可能出现线程安全问题。

 线程同步的作用:是用于解决线程安全问题，我们说线程同步了就是指线程安全了。

线程同步解决线程安全问题的核心思想：
    就是让多个线程实现先后有序的访问共享资源,每次只能一个线程执行完毕,另一个线程才能进行。

线程同步的方式:有三种
    (1)同步代码块
    (2)同步方法
    (3)lock锁

同步代码块：
     思想：把“出现线程安全问题的核心代码”给锁起来，每次只能进入一个线程，
     其他线程必须在外面等这个线程执行完毕以后，才能进入执行，这样就线程安全了。
格式:
     synchronized(锁对象){
        出现线程安全问题的核心代码。
     }
锁对象：原则上可以是任意唯一的Java对象。
        理论上:在实例方法中推荐用this作为锁.在静态方法中推荐用类名.class字节码文件作为锁对象
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
