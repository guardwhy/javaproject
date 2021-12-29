package cn.guardwhy_02;
/**
反射：是Java的高级技术，是Java独有的技术。是Java技术显著的特点。

反射是指对于任何一个类，在运行的时候都可以直接得到这个类全部成分。
在运行时,可以直接得到这个类的构造器对象.(Constructor)在运行时,可以直接得到这个类的成员变量.(Field）
在运行时,可以直接得到这个类的成员方法。（Method）

反射的核心思想和关键就是得到：编译以后的class文件对象。
     反射提供了一个Class类型，就是可以得到编译以后的class类对象。
     HelloWorld.java -> javac -> HelloWorld.class
     Class c = HelloWorld.class;
注意：反射是工作在运行时的技术，因为只有运行之后才会有class类对象。

反射为一个类的全部成分都设计了一个类型来代表这个对象：
     Class : 字节码文件
     Constructor : 构造器类型
     Field : 成员变量
     Method : 方法

反射技术的第一步永远是先得到Class类对象:有三种方式获取
     （1） 类名.class
     （2） 通过类的对象.getClass()方法
     （3） Class.forName("类的全限名")
        -- public static Class<?> forName(String className)
Class类下的方法：
     String getSimpleName(); 获得类名字符串：类名
     String getName();  获得类全名：包名+类名
     T newInstance() ;  创建Class对象关联类的对象
总结：
 反射必须工作在运行时。反射的关键是得到编译以后的Class文件对象
 反射可以在运行时得到一个类的全部成分进行一些操作。
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception{
        // 方式1:类名.class
        Class clazz1 = Student.class;
        System.out.println("类对象1:" + clazz1); // 类对象:class cn.guardwhy_02.Student
        /*
            Class<?> clazz2 = Student.class;
            System.out.println("类对象:" + clazz2);
            Class<Student> clazz3 = Student.class;
            System.out.println("类对象:" + clazz3);
        */
        // 方式2:通过类的对象.getClass()方法
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println("类对象2:" + c2);

        /**
         *方式三:通过类加载class文件对象,通过类的全限找到
         */
        Class c3 = Class.forName("cn.guardwhy_02.Student");
        System.out.println("类对象:" + c3);

        System.out.println("类的简名:" + c3.getSimpleName());
        System.out.println("类的全限名:" + c3.getName());
    }
}
