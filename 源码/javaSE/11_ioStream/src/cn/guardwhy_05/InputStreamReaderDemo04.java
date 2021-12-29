package cn.guardwhy_05;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
字符输入转换流.
                字节流                                     字符流
 字节输入流               字节输出流              字符输入流         字符输出流
 InputStream             OutputStream          Reader            Writer   (抽象类)
 FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
                                               InputStreamReader   OutputStreamWriter(转换流)

字符输入转换流：InputStreamReader
     -- 作用: 把原始的字节输入流按照指定的编码转换成字符流，从而解决不同编码读取数据乱码的问题。
     -- 构造器：
         public InputStreamReader(InputStream is):默认是以当前代码编码转换成字符流（几乎不用）
         public InputStreamReader(InputStream is,String charset):指定编码转换成字符流（很重要）
总结：
     字符输入转换流：可以把原始的字节流按照指定的编码转换成字符流
     从而可以解决不同编码读取乱码的问题。
 */
public class InputStreamReaderDemo04 {
    public static void main(String[] args) throws Exception{
        // 1.先获取文件的原始字节流
        InputStream is = new FileInputStream("src/test2/test04.txt");
        Reader fr = new InputStreamReader(is);
        // 定义字符数组
        char[] buffer = new char[11];
        // 定义长度
        int len = 0;
        while ((len = fr.read(buffer)) != -1){
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
    }
}
