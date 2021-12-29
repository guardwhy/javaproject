package cn.guardwhy.singleDemo01;
/*
懒汉单例设计模式
    真正需要的时候，才创建一个对象。
        步骤：
         a.定义一个对象变量用于后面存储一个对象，此时是没有创建对象的。
         b.把构造器进行私有化，外面就不能创建新对象。
         c.提供一个方法，等需要对象的时候判断是否有一个唯一对象，如果没有创建一个对象。
            以后都是直接返回这个对象即可！！
*/
public class LazySingle02 {
    public static void main(String[] args) {
        MyLazySingle02 t1 = MyLazySingle02.getInstance();
        MyLazySingle02 t2 = MyLazySingle02.getInstance();
        // 输出结果
        System.out.println(t1); // cn.guardwhy.singleDemo01.MyLazySingle02@49e4cb85
        System.out.println(t1); // cn.guardwhy.singleDemo01.MyLazySingle02@49e4cb85
        System.out.println(t1 == t2); // true
    }
}

// 懒汉式单例模式
class MyLazySingle02{
    // 1.定义一个对象变量用于保存一个对象,但是这里还没有创建对象
    private static MyLazySingle02 instance = null;
    // 2.把构造器私有起来
    private MyLazySingle02(){

    }
    // 3.返回这个唯一的对象
    public static MyLazySingle02 getInstance(){
        // 3.1 懒汉模式是现在需要，才创建对象。
        if(instance == null){
            instance = new MyLazySingle02();
        }
        // 3.2 返回对象
        return instance;
    }
}
