package cn.guardwhy_09;
/**
 线程通信：多个线程因为在同一个进程中，所以互相通信比较容易。

 线程通信的经典模型：生产者与消费者问题。
 生产者负责生成商品，消费者负责消费商品。
 生成不能不剩，消费不能没有，是一个同步模型。

 线程通信必须先保证线程安全，否则代码会报出异常！！

 模拟一个案例：
     curry和james有一个共同账户：共享资源
     他们有3个爸爸（亲爸，岳父，干爹）给他们存钱。

     模型：curry和james去取钱，如果有钱就取出，等待自己，唤醒他们3个爸爸们来存钱
     他们的爸爸们来存钱，如果发现有钱就不存，没钱就存钱，然后等待自己，唤醒孩子们来取钱。
     整存整取 10000元。
 分析：
     生产者：亲爸，岳父，干爹
     消费者：curry，james
     共享资源：账户对象。

 线程通信的核心方法：
     public void wait()` : 让当前线程进入到等待状态 此方法必须锁对象调用.
     public void notify()` : 唤醒当前锁对象上等待状态的某个线程  此方法必须锁对象调用
     public void notifyAll()` : 唤醒当前锁对象上等待状态的全部线程  此方法必须锁对象调用
 */
public class ThreadCommunication01 {
    public static void main(String[] args) {
        // 创建一个共享资源账户对象
        Account acc = new Account("ISBC-162530", 0);

        // 定义两个取钱线程代表curry和james
        new DrawThread("curry", acc).start();
        new DrawThread("james", acc).start();

        // 定义三个存钱线程,分别代表亲爸,岳父,干爹
        new SaveThread("亲爸", acc).start();
        new SaveThread("干爹", acc).start();
        new SaveThread("岳父", acc).start();
    }
}
