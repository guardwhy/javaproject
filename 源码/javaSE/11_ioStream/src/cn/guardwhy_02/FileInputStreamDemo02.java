package cn.guardwhy_02;

import java.io.FileInputStream;
import java.io.InputStream;

/**
文件字节输入流的使用-使用字节数组读取数据。

            字节流                         字符流
 字节输入流         字节输出流             字符输入流         字符输出流
 InputStream      OutputStream          Reader            Writer(抽象类)
 FileInputStream  FileOutputStream      FileReader        FileWriter(实现类)

 文件字节输入流：FileInputStream
     -- 作用：以内存为基本，把磁盘文件中的数据以一个一个的字节的形式读入到内存中的流。
     -- 构造器:
         public FileInputStream(File file):先创建文件对象，再通向文件对象。
         public FileInputStream(String file):直接通向文件路径。
     -- 方法:
         public int read():每次读取一个字节（读取一滴水），返回这个字节的数据。读取完毕返回-1
         public int read(byte b[]):每次读取一个字节数组的数据到字节数组中去，返回读取了多少个字节数，读取完毕返回-1
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 定义一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/test1/text1.txt");
        // 定义一个循环,读取文件的全部数据
        byte[] buffer = new byte[3];
        // 定义一个变量存储数组每次读取了多少个字节数
        int len = 0;
        while ((len = is.read(buffer)) !=-1){
            // 读取多少,就倒出多少
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
    }
}
