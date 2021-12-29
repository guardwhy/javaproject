package cn.guardwhy_11;

/**
死锁:多个线程同时被阻塞，它们中的一个或者全部都在等待某个资源被释放。
     由于线程被无限期地阻塞，因此程序不可能正常终止。

java死锁产生的四个必要条件：
     1、互斥使用，即当资源被一个线程使用(占有)时，别的线程不能使用
     2、不可抢占，资源请求者不能强制从资源占有者手中夺取资源，资源只能由资源占有者主动释放。
     3、请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的占有。
     4、循环等待，即存在一个等待队列：p1要p2的资源，p2要p1的资源。这样就形成了一个等待环路。

 当上述四个条件都成立的时候，便形成死锁。当然，死锁的情况下如果打破上述任何一个条件,便可让死锁消失。
总结：
   实现死锁一般需要进行锁资源的嵌套才会出现死锁。
 */
public class ThreadDead {
    // 定义两个静态资源对象
    public static Object resources1 = new Object();
    public static Object resources2 = new Object();

    public static void main(String[] args) {
        // 实现死锁现象至少存在两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resources1){
                    System.out.println("线程对象1对资源1上锁,占用资源1");
                    System.out.println("线程对象1开始请求资源2");
                    try {
                        // 线程休眠
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources2){
                        System.out.println("线程对象1对资源2上锁,占用资源2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resources2){
                    System.out.println("线程对象2对资源2上锁,占用资源2");
                    System.out.println("线程对象2开始请求资源1");
                    try {
                        // 线程休眠
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources1){
                        System.out.println("线程对象2对资源1上锁,占用资源1");
                    }
                }
            }
        }).start();
    }
}
