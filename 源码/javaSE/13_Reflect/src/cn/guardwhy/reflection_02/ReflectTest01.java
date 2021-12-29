package cn.guardwhy.reflection_02;
/**
 * 类什么时候初始化
*/

// 基类
class Person{
    // 定义静态变量a
    static int a = 10;
    static {
        System.out.println("父类被加载");
    }
}
// 派生类
class Student extends Person{
    static {
        System.out.println("子类被加载!!!");
        b = 30;
    }
    // 定义静态变量
    static int b = 21;
    // 定义常量
    static final int C = 11;
}
public class ReflectTest01 {
    static {
        System.out.println("main类被加载！！");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.1 主动引用
        //Student stu = new Student();
        // 1.2 反射也会产生主动调用
        // Class.forName("cn.guardwhy.reflection_02.Student");

        // 2.1 不会产生类的引用方法, 子类不会被加载
        System.out.println(Student.a);
        // 2.2 调用常量
        System.out.println(Student.C);
    }
}
