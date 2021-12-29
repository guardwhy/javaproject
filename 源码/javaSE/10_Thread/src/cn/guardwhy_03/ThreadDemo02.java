package cn.guardwhy_03;
/**
 匿名内部类简化写法！
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        // 直接创建Runnable的线程任务对象的匿名内部类形式
        /*
            Runnable target = new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<10; i++){
                        System.out.println(Thread.currentThread().getName() + "=>" + i);
                    }
                }
            };

            Thread t1 = new Thread(target);
            t1.start();
        */

        // 匿名形式..
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println(Thread.currentThread().getName() + "=>"+i);
                }
            }
        }).start();

        // 遍历操作
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}
