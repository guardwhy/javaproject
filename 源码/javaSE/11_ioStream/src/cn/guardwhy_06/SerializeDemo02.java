package cn.guardwhy_06;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
对象反序列化技术。

 序列化：就是把Java对象存储到文件中去。    对象 => 文件中
 反序列化：把Java对象的文件数据恢复到Java对象中。  文件中 => 对象

 对象序列化需要使用：对象字节输出流ObjectOutputStream
     -- 构造器：public ObjectOutputStream(OutputStream os)
     -- 方法：public final void writeObject(Object obj)：序列化对象
     -- 注意：对象如果要参与序列化，类必须实现序列化接口:implements Serializable
     -- 如果某个字段不想参与序列化:加上transient修饰即可!!

 对象反序列化需要使用：对象字节输入流ObjectInputStream
     -- 构造器：public ObjectInputStream(InputStream is):
     -- 方法：  public final Object readObject():
     -- 注意：对象类需要申明序列化版本号：
        // 序列化版本
        private static final long serialVersionUID = 1;

 ----------------------------------------------------------------------
                    字节流                                     字符流
     字节输入流               字节输出流              字符输入流         字符输出流
     InputStream             OutputStream          Reader            Writer   (抽象类)
     FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
     BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
                                                    InputStreamReader OutputStreamWriter
     ObjectInputStream       ObjectOutputStream
 */
public class SerializeDemo02 {
    public static void main(String[] args) throws Exception{
        // 定义一个原始的字节输入流与源文件接通
        InputStream is = new FileInputStream("src/test2/obj.dat");
        // 把字节输入流包装成一个高级的对象字节输入流
        ObjectInputStream ois = new ObjectInputStream(is);
        // 开始反序列化
        Student stu = (Student) ois.readObject();
        // 输出对象
        System.out.println(stu);
        // 关闭资源
        ois.close();
    }
}
