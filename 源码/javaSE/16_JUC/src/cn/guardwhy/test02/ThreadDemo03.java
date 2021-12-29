package cn.guardwhy.test02;

public class ThreadDemo03 {
    public static void main(String[] args) {
        // 创建线程对象
        Account accout = new Account();
        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "kobe").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "curry").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "james").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "rondo").start();
    }

}

// 资源类
class Account {
    // 判断等待，业务， 通知
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        // 判断是否该线程执行操作
        while (number != 0){
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
        while(number == 0){
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
