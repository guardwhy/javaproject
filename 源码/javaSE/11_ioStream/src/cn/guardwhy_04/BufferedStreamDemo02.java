package cn.guardwhy_04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 目标：字节缓冲输出流的使用。

                    字节流                                     字符流
     字节输入流               字节输出流              字符输入流         字符输出流
     InputStream             OutputStream          Reader            Writer   (抽象类)
     FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
     BufferedInputStream     BufferedOutputStream     BufferedReader    BufferedWriter(实现类，缓冲流)

字节缓冲输出流：BufferedOutputStream
     -- 作用：可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能。
     -- 构造器：public BufferedOutputStream(OutputStream os)
     -- 原理：缓冲字节输出流自带了8KB缓冲池,数据就直接写入到缓冲池中去，性能极高了！
总结：
 字节缓冲输出流提高了字节输出流写数据的性能，但是功能是一样使用的。
 */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws Exception{
        // 创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("src/test2/test02.txt");
        // 把低级的字节输出流包装成一个高级的缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(os);
        // 写数据出去
        bos.write('a');
        bos.write('b');
        bos.write(97);
        System.out.println("\n");
        bos.write("guardwhy快乐的学习java".getBytes());

        // 关闭数据
        bos.close();
    }
}
