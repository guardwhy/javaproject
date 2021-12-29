package cn.guardwhy_07;

import java.io.PrintWriter;

/**
 打印流有：PrintStream / PrintWriter
 打印流的作用：可以方便并且高效的打印各种类型的数据出去。

 PrintWriter:打印流
 -- 构造器:
 public PrintWriter(OutputStream os):直接通向字节输出流
 public PrintWriter (Writer out):直接通向字符输出流
 public PrintWriter(String path): 直接通向文件地址
总结：
    PrintWriter:打印流可以高效，方便的打印各种数据类型出去。
 */
public class PrintWriterDemo02 {
    public static void main(String[] args) throws Exception{
        // 创建打印流对象
        PrintWriter ps = new PrintWriter("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test3\\b.txt");
        ps.println(97);
        ps.println("kobe is mvp!!");
        ps.println('c');

        // 写一个字符
        ps.write(97);
        // 写一个字符串出去
        ps.write("我在公司写代码");
        // 关闭打印流
        ps.close();
    }
}
