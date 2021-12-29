package cn.guardwhy_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
文件字节输出流：FileOutputStream
     -- 作用：以内存为基准，把内存中的数据以字节的形式写出到磁盘文件中去的流。
     -- 构造器：
         public FileOutputStream(File file):
         public FileOutputStream(String file):
         public FileOutputStream(File file,boolean append):追加数据的管道
         public FileOutputStream(String file,boolean append)::追加数据的管道

    -- 方法
         public  void write(int b) ：写一个字节出去
         public  void write(byte[] buffer) ：写一个字节数组出去
         public  void write(byte[] b, int off, int len) ：写一个字节数组的一部分出去
总结：
     注意：输出流默认是覆盖之前全部内容！！
     如果要追加数据应该在构造器的第二个参数加上：true.
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) throws Exception{
        // 1.1 定义一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("src/test1/text3.txt", true);
        // 1.2 写出一个字节出去
        os.write(97);
        os.write(98);
        os.write('a');
        os.write('b');
        // 1.3 写一个换行
        os.write("\r\n".getBytes());

        // 2.1 写一个字节数组出去(倒一桶水出去)
        byte[] buffer1 = "我是java程序员, I love java".getBytes();   // 以默认的UTF-8转字节数组
        os.write(buffer1);
        // 2.2 写一个换行
        os.write("\r\n".getBytes());

        // 3.1 写一个字节数组的一部分出去
        byte[] buffer2 = "我爱java,java是最牛逼的".getBytes();
        // 3.2 发送:我爱java
        os.write(buffer2, 0, 10);
        os.write("\r\n".getBytes());

        // 关闭刷新
        os.close();
    }

    /**
    字节流做文件的复制。

     计算机中所有的文件的底层都是由字节组成的。
     字节流很适合做文件的复制，只要复制前后文件的格式一致，绝对没有问题。

    分析：
         （1）定义一个字节输入流管道与源文件接通
         （2）定义一个字节输出流管道与目标文件接通
         （3）定义一个字节数组。
         （4）定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可！读多少倒出多少！！

    需求：
     src\test\aaa\my.jpg -> src\test\abc\newMy.jpg
     */
    public static class CopyDemo01 {
        public static void main(String[] args) {
            InputStream is = null;
            OutputStream os = null;

            try {
                // 定义一个字节输入流管道与源文件接通
                is = new FileInputStream("src/test1/aaa/my.jpg");
                // 定义一个字节输出流管道与目标文件接通
                os = new FileOutputStream("src/test1/abc/newMy.jpg");
                // 定义一个字节数组
                byte[] buffer = new byte[1024];
                // 定义一个循环从字节输入流管道中读取数据,倒出到字节输出流管道即可.
                int len = 0;
                // 条件遍历
                while ((len = is.read(buffer)) != -1){
                    // 读出多少,倒出多少
                    os.write(buffer, 0, len);
                }
                System.out.println("复制成功..");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // 关闭刷新
                    if(os!= null)os.close();
                    if(is!= null)is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
