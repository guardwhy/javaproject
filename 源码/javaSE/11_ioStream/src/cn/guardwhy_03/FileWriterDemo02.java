package cn.guardwhy_03;

import java.io.FileWriter;
import java.io.Writer;

/**
文件字符输出流的使用。

                字节流                                 字符流
    字节输入流         字节输出流             字符输入流         字符输出流
    InputStream      OutputStream          Reader            Writer(抽象类)
    FileInputStream  FileOutputStream      FileReader        FileWriter(实现类)

 文件字符输出流：FileWriter
     -- 作用：以内存为基准,把内存中的数据以字符的形式写出到磁盘文件中去,一般用于写数据到文本文件！
     -- 构造器：
         public FileWriter(File file)
         public FileWriter(String file)
         public FileWriter(String file,boolean append)
         public FileWriter(String file,boolean append)
    -- 方法：
         public void write(int c)：写一个字符出去
         public void write(String str) : 写一个字符串出去
         public void write(char cbuf[]) ：写一个字符数组出去
         public void write(String str, int off, int len):写一个字符串的一部分出去
         public void write(char cbuf[], int off, int len):写一个字符数组的一部分出去
 */
public class FileWriterDemo02 {
    public static void main(String[] args) throws Exception{
        // 1.定义一个字符输出流与目标文件接通
        Writer fw = new FileWriter("src/test1/text5.txt", true);
        // 2.写一个字符出去
        fw.write(97); // 写一个字符a出去
        fw.write('a'); // 写一个字符a出去
        fw.write('何');
        fw.write("\r\n"); // 换行

        // 3.写一个字符串出去
        fw.write("curry是mvp!!!");
        fw.write("\r\n"); // 换行

        // 4.写一个字符数组出去
        fw.write("curry是mvp!!!".toCharArray());
        fw.write("\r\n"); // 换行

        // 5.写一个字符串的一部分出去
        fw.write("我在公司看球赛，看的很开心..", 0,4);
        fw.write("\r\n"); // 换行

        // 6.写一个字符串的一部分出去
        fw.write("我在公司看球赛，看的很开心..".toCharArray(), 0,4);
        fw.write("\r\n"); // 换行

        // 刷新流
        fw.flush();
    }
}
