package cn.guardwhy_02;
/**
 * 学生类
 */
public class Student {
    private String name;  // 姓名
    // 无参构造
    public Student() {

    }
    // 带参构造器
    public Student(String name) {
        this.name = name;
    }

    /**
     * set.get方法
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
