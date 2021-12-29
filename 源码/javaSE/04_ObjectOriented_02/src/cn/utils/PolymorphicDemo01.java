package cn.utils;

// 基类
class People {
    public void run(){
        System.out.println("People可以跑步");
    }
}
// 派生类:Student
class Student extends People {
    @Override
    public void run(){
        System.out.println("学生跑的的贼溜..");
    }

    // 独有功能
    public void study(){
        System.out.println("学生要学习...");
    }
}

// 派生类:Teacher
class Teacher extends People {
    @Override
    public void run(){
        System.out.println("老师跑的的很快...");
    }

    // 独有功能
    public void readBook(){
        System.out.println("老师要看书...");
    }
}


public class PolymorphicDemo01 {
    public static void main(String[] args) {
        // 创建p1对象
        People p1 = new Student();
        p1.run();
        // 强制类型转换
        Student st1 = (Student) p1;
        st1.study();
        System.out.println("======");

        // 创建p2对象
        People p2 = new Teacher();
        // 强制类型转换
        Teacher teacher1 = (Teacher) p2;
        teacher1.readBook();
        System.out.println("++++++");


        People p3 = new Teacher();
        // Cat ct = (Cat) a2; // 报错！

        // 判断teacher2的真实类型是否是Teacher类型或者其子类类型。
        if(p3 instanceof Teacher){
            Teacher teacher2 = (Teacher) p3;
            teacher2.readBook();
        }else if(p3 instanceof Student){
            Student st2 = (Student) p3;
            st2.study();
        }

    }
}



