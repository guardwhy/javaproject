package cn.guardwhy_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
字符缓冲输入流的使用。
                 字节流                                       字符流
     字节输入流               字节输出流              字符输入流         字符输出流
     InputStream             OutputStream          Reader            Writer   (抽象类)
     FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 BufferedInputStream       BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)

字符缓冲输入流：BufferedReader
     -- 作用：字节缓冲输入流可以把字符输入流包装成一个高级的缓冲字符输入流，可以提高读数据的性能。
     -- 构造器：public BufferedReader(Reader reader):
     -- 原理：缓冲字符输入流默认会有一个8K的字符缓冲池,可以提高读字符的性能。
     -- 字符缓冲输入流多了一个按照行读取数据的特有功能：
        public String readLine(): 读取一行数据返回!!读取完毕了返回null
总结：
     缓冲字符输入流提高了读字符的性能，多了一个按照行读取数据的功能：
     public String readLine(): 读取一行数据返回!!读取完毕了返回null
 */
public class BufferedReaderDemo01 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("src/test2/hello.java");
        // 2.低级的字符输入流包装成一个高级的缓冲字符输入流管道
        BufferedReader br = new BufferedReader(fr);

        /*
             // 定义一个字节数组循环读取数据
            char[] buffer = new char[6];
            // 定义字符串长度
            int len = 0;
            // 条件判断
            while ((len = br.read(buffer)) != -1){
                String rs = new String(buffer, 0, len);
                System.out.println(rs);
            }
        */

        // 3.定义字符串存储一行数据
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
