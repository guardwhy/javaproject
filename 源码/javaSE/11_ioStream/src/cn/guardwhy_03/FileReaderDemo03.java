package cn.guardwhy_03;

import java.io.FileReader;
import java.io.Reader;

/**
文件字符输入流的使用。

                字节流                                 字符流
     字节输入流         字节输出流             字符输入流         字符输出流
     InputStream      OutputStream          Reader            Writer(抽象类)
     FileInputStream  FileOutputStream      FileReader        FileWriter(实现类)

文件字符输入流：FileReader
     -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读取到内存中去的流，一般用于读取文本文件。
     -- 构造器：
         public FileReader(File file)
         public FileReader(String file)
     -- 方法：
         public int read():读取一个字符的编号返回。如果读取完毕返回的是-1.
         public int read(char cbuf[]):读取字符到一个字符数组中去，返回读取的字符个数，读取完毕了返回-1
总结：
    读取文本文件内容，建议用字符流。
 */
public class FileReaderDemo03 {
    public static void main(String[] args) throws Exception{
        // 1.定义一个字符输入流管道与源文件接通。
        Reader fr = new FileReader("src/test1/text4.txt");

        /*
        // 2.读取一个字符的编号返回。
        int c1 = fr.read();
        System.out.println("字符:" + (char) c1); // 字符:数
        // 3.读取完毕
        int c2 = fr.read();
        System.out.println("文本文件个数:" + c2); // 文本文件个数:32452
        */

        // 4.定义一个字符数组读取数据
        char[] buffer = new char[3];
        // 定义长度
        int len = 0;
        System.out.println("文本文件:");
        while ((len = fr.read(buffer)) != -1){
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
        // 关闭输入流
        fr.close();
    }
}
