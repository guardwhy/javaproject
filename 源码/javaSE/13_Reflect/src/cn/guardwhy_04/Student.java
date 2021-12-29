package cn.guardwhy_04;

public class Student {
    // 成员变量
    private String name;
    private int age ;
    private String color ;
    public static String school1;
    public static final String school2 = "中山大学医学院";

    // 无参构造
    public Student() {

    }
    // 带参构造
    public Student(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * set.get方法
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
