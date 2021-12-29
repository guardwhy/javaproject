package cn.guardwhy.test02;

/*
* 线程之间的通信问题: 生产者和消费者问题, 等待唤醒，通知唤醒
* 线程交替执行，两个线程操作同一个变量    number=0
*/
public class ThreadDemo02 {
    public static void main(String[] args) {
        // 创建线程对象
        Account data = new Account();
        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "kobe").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "curry").start();
    }
}

// 资源类
class Accout {
    // 判断等待，业务， 通知
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        // 判断是否该线程执行操作
        if(number != 0){
            // 等待操作
            this.wait();
        }
        // 执行操作+1
        number++;
        System.out.println(Thread.currentThread().getName() + "===>" + number);
        // 通知其他线程，num+1执行完毕
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        // 判断是否该线程执行操作
        if(number == 0){
            // 等待操作
            this.wait();
        }
        // 执行操作+1
        number--;
        System.out.println(Thread.currentThread().getName() + "===>" + number);
        // 通知其他线程，num-1执行完毕
        this.notifyAll();
    }
}
