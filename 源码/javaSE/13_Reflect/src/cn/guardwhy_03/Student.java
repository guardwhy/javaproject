package cn.guardwhy_03;
/**
 学生类
 */
public class Student {
    // 成员变量
    private String name;
    private int age;
    // 无参构造器
    public Student() {

    }
    // 带参构造器
    public Student(String name, int age) {
        System.out.println("==有参构造器==");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
