package cn.guardwhy_07;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    * 自然排序
    */
    @Override
    public int compareTo(Student o) {
        /*
            // 1.姓名比较
            int compare = this.getName().compareTo(o.getName());
            if(0 == compare){
                // 2.年龄比较
                return this.getAge() - o.getAge();
            }
            // 3.返回比较器
            return compare;
        */

        // 2.简化写法
        // 2.1 姓名比较
        int compare = this.getName().compareTo(o.getName());
        // 2.年龄比较
        return 0 != compare ? compare : this.getAge() - o.getAge();
    }
}
