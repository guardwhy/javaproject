package cn.guardwhy.reflection_01;

class A{
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }
    /*
    * m = 300
    * m = 100
    */

    // 静态变量
    static int m = 100;

    // 无参构造
    public A() {
        System.out.println("A类的无参构造初始化..");
    }
}

public class ReflectTest04 {
    public static void main(String[] args) {
        /*
        * 1.加载到内存,会产生一个类对应的class对象
        * 2.链接,链接结束后 m = 0;
        * 3.初始化
        *   <clinit>(){
        *       System.out.println("A类的无参构造初始化..");
        *       m = 300;
        *       m = 100;
        *   }
        *   m = 100;
        */

        A a = new A();
        System.out.println(A.m);
    }
}
