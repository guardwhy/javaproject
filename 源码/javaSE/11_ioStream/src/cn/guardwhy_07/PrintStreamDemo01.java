package cn.guardwhy_07;

import java.io.PrintStream;

/**
 打印流有：PrintStream / PrintWriter
 打印流的作用：可以方便并且高效的打印各种类型的数据出去。

 PrintStream:打印流
     -- 构造器:
     public PrintStream(OutputStream os):直接通向字节输出流
     public PrintStream(String path): 直接通向文件地址
 总结：
    PrintStream:打印流可以高效，方便的打印各种数据类型出去，而且也可以写字节数据出去！
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception{
        // 创建一个打印流对象
        PrintStream ps = new PrintStream("src/test3/a.txt");
        ps.println(97);
        ps.println("kobe is mvp!!");
        ps.println('c');

        // 写一个字符
        ps.write(97);
        // 写一个字节出去
        ps.write("我在公司写代码".getBytes());
        // 关闭打印流
        ps.close();
    }
}
