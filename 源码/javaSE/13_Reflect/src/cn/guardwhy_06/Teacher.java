package cn.guardwhy_06;
/**
 * teacher类
 */
public class Teacher {
    private String name ;
    private int age ;
    private String hobby ;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String hobby, double salary) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.salary = salary;
    }
    // 听课注意力+悟性+写代码(练习)+胡思乱想。
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
