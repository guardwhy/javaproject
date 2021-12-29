package cn.guardwhy.reflection_01;
// 反射
// 实体类
class User {
    // 成员属性
    private int id;
    private int age;
    private String name;
    // 无参构造器
    public User() {

    }
    // 带参构造
    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Test1 extends Object{
    public static void main(String[] args) throws Exception {
        // 1.通过反射获取类的Class对象
        Class c1 = Class.forName("cn.guardwhy.reflection_01.User");

        System.out.println("c1的Class对象:" + c1); // c1的Class对象:class cn.guardwhy.reflection01.User

        Class c2 = Class.forName("cn.guardwhy.reflection_01.User");
        System.out.println("c2的Class对象:" + c2); // c2的Class对象:class cn.guardwhy.reflection01.User

        //一个类被加载后,类的整个结构信息会被放到对应的Class对象中
        // 一个类只对应一个Class对象
        System.out.println("c1:" + c1.hashCode());  // c1:1735600054
        System.out.println("c2:" + c2.hashCode());  // c2:1735600054


    }
}
