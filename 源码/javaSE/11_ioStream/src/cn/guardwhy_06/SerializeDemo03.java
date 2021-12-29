package cn.guardwhy_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 需求：用一个List集合存储若干个用户对象。然后序列化这些对象，再反序列化对象 。
 */
public class SerializeDemo03 {
    public static void main(String[] args) throws Exception{
        // 创建stus集合对象
        List<Student> stus = new ArrayList<>();
        // 将对象添加到集合中
        stus.add(new Student("Zx", "紫霞仙子", "1236"));
        stus.add(new Student("Stephen", "curry", "12358"));
        stus.add(new Student("LeBron", "James", "23"));

        // 序列化对象
        serializeList1(stus);
        // 反序列化对象
        serializeList2();
    }

    // 声明序列化方法
    private static void serializeList1(List<Student> stus) throws Exception{
        // 创建一个字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/list.dat"));
        // 开始序列化对象
        oos.writeObject(stus);
        // 关闭资源
        oos.close();
    }

    // 声明反序列化方法
    private static void serializeList2() throws Exception{
        // 创建一个对象字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/list.dat"));
        // 开始反序列化
        List<Student> stus = (List<Student>) ois.readObject();
        // 遍历集合对象
        for(Student stu : stus){
            System.out.println(stu);
        }
    }
}
