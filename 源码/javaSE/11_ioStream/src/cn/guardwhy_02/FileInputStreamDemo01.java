package cn.guardwhy_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
文件字节输入流的使用。

             字节流                                    字符流
     字节输入流         字节输出流             字符输入流         字符输出流
     InputStream      OutputStream          Reader            Writer(抽象类)
     FileInputStream  FileOutputStream      FileReader        FileWriter(实现类)

文件字节输入流：FileInputStream
     -- 作用：以内存为基本，把磁盘文件中的数据以一个一个的字节的形式读入到内存中的流。
     -- 构造器:
         public FileInputStream(File file):
         public FileInputStream(String file):
     -- 方法:
         public int read():每次读取一个字节（读取一滴水），返回这个字节的数据。读取完毕返回-1
         这种方式：无法避免中文乱码！
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.定义文件对象的地址
        File file = new File("src/test1/text1.txt");
        // 2.定义一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream(file);
        // 3.开始读取数据
        int c1 = is.read();
        System.out.println("第一个字符:" + (char) c1);   // 第一个字符:#

        // 读取第二个字符
        int c2 = is.read();
        System.out.println("第二个字符:" + (char) c2);   // 第二个字符:i
        // 读取第三个字符
        int c3 = is.read();
        System.out.println("第三个字符:" + (char) c3);   // 第三个字符:n

        // 读取完毕了
        int c4 = is.read();
        System.out.println("该文件共有:" + c4 + "字符");   // 该文件共有:99字符
    }
}
