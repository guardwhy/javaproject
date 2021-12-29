package cn.guardwhy_05;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
字符输出转换流：OutputStreamWriter
     -- 作用：可以把字节输出流按照指定编码转换成字符输出流，可以实现写某种编码的字符数据出去。
     -- public OutputStreamWriter(OutputStream os):
     -- public OutputStreamWriter(OutputStream os , String charset):
总结：
 字符输出转换流可以把字节输出流指定编码转换成字符流。
 */
public class OutputStreamWriterDemo05 {
    public static void main(String[] args) throws Exception{
        // 创建一个字节输出流管道
        OutputStream os = new FileOutputStream("src/test2/test05.txt");
        // 把字节输出流转换成一个字符输出流
        Writer fw = new OutputStreamWriter(os);
        // 写入操作
        fw.write("科比是mvp");
        // 关闭流
        fw.close();
    }
}
