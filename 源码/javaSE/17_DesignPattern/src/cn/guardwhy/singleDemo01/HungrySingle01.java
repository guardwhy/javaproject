package cn.guardwhy.singleDemo01;
/**
 单例模式的含义： 单例模式，是一种常用的软件设计模式。通过单例模式可以保证系统中，
        应用该模式的这个类永远只有一个实例。即一个类永远只有一个对象实例。

 单例的应用场景：在实例开发中，有很多业务对象永远只需要一个，无论启动多少次
                我们只需要一个对象，例如任务管理对象，只需要一个。节约内存和性能。

 单例的设计方式:
    （1）饿汉单例设计模式
         在用类的时候，对象已经创建好了。
         步骤：
         a.定义一个对象，最好static和final修饰，这样这个对象永远是唯一不可变的对象了。
         b.把构造器进行私有化，外面就不能创建新对象。
         c.提供一个方法把唯一的单例对象返回出去。
 */
public class HungrySingle01 {
    public static void main(String[] args) {
        // 4.创建对象
        MyHungrySingle01 single1 = MyHungrySingle01.getInstance();
        MyHungrySingle01 single2 = MyHungrySingle01.getInstance();
        // 5.输出结果
        System.out.println(single1 == single2);
    }
}

class MyHungrySingle01{
    // 1.定义一个对象
    private static final MyHungrySingle01 instance = new MyHungrySingle01();
    // 2.将构造器私有化
    public MyHungrySingle01() {
    }

    // 3.返回唯一的对象
    public static MyHungrySingle01 getInstance(){
        return instance;
    }
}
