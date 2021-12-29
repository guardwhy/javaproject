package cn.guardwhy.reflection_02;

public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // sun.misc.Launcher$AppClassLoader@18b4aac2
        // 2.获取系统类加载器的父类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); // sun.misc.Launcher$ExtClassLoader@677327b6
        // 3.获取拓展类加载器的父类加载器--> 跟加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);    // null

        // 4.测试当前类的是哪个加载器加载的
        ClassLoader classLoader = Class.forName("cn.guardwhy.reflection_02.ReflectTest02").getClassLoader();
        System.out.println(classLoader);
        // 5.测试JDK内置的类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        // 6.如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
