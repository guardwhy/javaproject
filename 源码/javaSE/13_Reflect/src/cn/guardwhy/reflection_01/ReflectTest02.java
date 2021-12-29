package cn.guardwhy.reflection_01;
/*
* 获取Class对象方式
*/

// 基类
class Person{
    // 姓名
    public String username;
    // 无参构造
    public Person() {

    }
    // 带参构造
    public Person(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                '}';
    }
}
// 学生类
class Student extends Person{
    public Student() {
        this.username = "Curry";
    }
}

// Teacher类
class Teacher extends Person{
    public Teacher() {
        this.username = "Kobe";
    }
}

public class ReflectTest02{
    public static void main(String[] args) throws Exception {
        // 1.获取person对象
        Person person = new Student();
        System.out.println("姓名是:" + person.username);

        // 2.方式一: 通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 3.方式二: 类去加载class文件对象,通过类的全限名找到。
        Class c2 = Class.forName("cn.guardwhy.reflection_01.Student");
        System.out.println(c2.hashCode());

        // 4.方式三：通过类的静态成员class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 5.方式四:基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        // 6.获得父类类型
        Class c5 = c2.getSuperclass();
        System.out.println("父类Class对象:" + c5);
    }
}
