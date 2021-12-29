package cn.guardwhy_05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
字符缓冲输出流的使用。

                    字节流                                      字符流
     字节输入流               字节输出流              字符输入流         字符输出流
     InputStream             OutputStream          Reader            Writer   (抽象类)
     FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
     BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)

 字符缓冲输出流：BufferedWriter
     -- 作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能。
     -- 构造器：public BufferedWriter(Writer writer):
     -- 原理：高级的字符缓冲输出流多了一个8k的字符缓冲池，写数据性能极大提高了!
     -- 字符缓冲输出流多了一个换行的特有功能：
        public void newLine()：新建一行
 */
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个字符输出流与目标文件接通
        Writer fw = new FileWriter("src/test2/test03.txt", true);
        // 2.把低级的字符输出流管道包装成一个高级的字符缓冲输出流管道
        BufferedWriter bw = new BufferedWriter(fw);
        // 3.输出操作
        bw.write("在公司看电影");
        bw.newLine(); // 换行操作

        bw.write("在公司加班写代码...很开心");
        bw.write("\r\n");   // 换行

        // 关闭字符缓冲输出流
        bw.close();
    }
}
