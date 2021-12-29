package cn.guardwhy_04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 字节缓冲输入流的使用。

                字节流                                         字符流
     字节输入流               字节输出流              字符输入流         字符输出流
     InputStream             OutputStream          Reader            Writer   (抽象类)
     FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
     BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)

字节缓冲输入流：BufferedInputStream
     -- 作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高读数据的性能。
     -- 构造器: public BufferedInputStream(InputStream in)
     -- 原理：缓冲字节输入流管道包装了低级的字节输入流管道以后
         就自带一个缓冲池，缓冲池是内存的一块区域，一次可以直接提取8KB数据到内存
         以后程序直接在内存的缓冲池中读取数据，性能是很快的！
总结：
 缓冲字节输入流只是提高了字节输入流读取数据的性能，功能是一样用的。
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 定义一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/test2/test01.txt");
        // 把字节输入流管道包装成一个高级的缓冲字节输入流管道
        BufferedInputStream bis = new BufferedInputStream(is);

        // 定义一个字节数组循环读取数据
        byte[] buffer = new byte[3];
        int len = 0;
        System.out.print("字节缓冲输入流:");
        while ((len = bis.read(buffer)) != -1){
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
    }
}
