package cn.guardwhy_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
字节流读取文本文件乱码的解决思想。

 我们可以定义一个与文件字节数刚刚好一样大的数组，一桶水读取完文件的数据输出即可.
总结：
     这种方式是一次把文件数据全部读取完毕可以避免中文乱码,但是如果文件过大可能出现内存溢出.
     读取文本文件内容最好的方式是用字符流。
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("src/test1/text2.txt");

        File f = new File("src/test1/text2.txt");
        // 定义一个数组，读取文件的全部数据。这个字节数组的大小与文件的大小一样大
        byte[] buffer = new byte[(int) f.length()];
        int len = is.read(buffer);
        String rs = new String(buffer);
        System.out.println(rs);

        // 直接一个字节数组读取文件全部数据(jdk1.9以上)
        /*byte[] buffer = is.readAllBytes();
        String rs = new String(buffer);
        System.out.println(rs);*/
    }
}
