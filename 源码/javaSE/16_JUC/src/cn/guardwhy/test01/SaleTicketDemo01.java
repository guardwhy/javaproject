package cn.guardwhy.test01;

// 1.并发:多线程操作同一个资源类，把线程拿进线程中
public class SaleTicketDemo01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        // 函数式接口
        new Thread(()->{
            for(int i = 1; i < 30; i++){
                ticket.saleTicket();
            }
        }, "kobe").start();
        new Thread(()->{
            for(int i = 1; i < 30; i++){
                ticket.saleTicket();
            }
        }, "Curry").start();
        new Thread(()->{
            for(int i = 1; i < 30; i++){
                ticket.saleTicket();
            }
        }, "James").start();
    }
}

// oop资源类
class Ticket{
    private int number = 30;

    // synchronized 本质: 队列, 锁
    public synchronized void saleTicket(){
        // 条件判断
        if(number > 0){
            System.out.println(Thread.currentThread().getName() + "卖出第" + (number--)
                    + "票, 还剩下:" + number + "张票");
        }
    }
}