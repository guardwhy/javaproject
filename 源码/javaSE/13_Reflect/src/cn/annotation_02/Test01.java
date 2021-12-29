package cn.annotation_02;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/*
* 学生类
*/
@Tablestu("db_student")
class Student{
    // 成员属性
    @Fieldstu(columnName="db_id", type = "int", length = 10)
    private int id;
    @Fieldstu(columnName="db_age", type = "int", length = 10)
    private int age;
    @Fieldstu(columnName = "db_name", type = "varchar", length = 6)
    private String name;

    public Student() {

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablestu{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldstu{
    String columnName();
    String type();
    int length();
}

public class Test01 {
    public static void main(String[] args) throws Exception {
        // 1.获得Class类对象
        Class c1 = Class.forName("cn.annotation_02.Student");
        // 2.通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation); // @cn.annotation_02.Tablestu(value=db_student)
        }

        // 3.获得注解的value的值
        Tablestu tablestu = (Tablestu)c1.getAnnotation(Tablestu.class);
        String value = tablestu.value();
        System.out.println(value);  // db_student

        // 4.获得类指定的注解
        Field f = c1.getDeclaredField("id");
        Fieldstu annotation = f.getDeclaredAnnotation(Fieldstu.class);
        System.out.println(annotation.columnName());    // db_id
        System.out.println(annotation.type()); // int
        System.out.println(annotation.length()); // 10
    }
}
