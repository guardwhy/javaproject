package cn.guardwhy_03;

import java.io.*;

/**
字节流做文件的复制。

 计算机中所有的文件的底层都是由字节组成的。
 字节流很适合做文件的复制，只要复制前后文件的格式一致，绝对没有问题。

 分析：
 （1）定义一个字节输入流管道与源文件接通
 （2）定义一个字节输出流管道与目标文件接通
 （3）定义一个字节数组。
 （4）定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可！读多少倒出多少！！
 */
public class CopyDemo01 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            // 1.定义一个字节输入流管道与源文件接通
            is = new FileInputStream("src/test1/aaa/my.jpg");
            // 2.定义一个字节输出流管道与目标文件接通
            os = new FileOutputStream("src/test1/abc/newMy.jpg");
            // 3.定义字节数组
            byte[] buffer = new byte[1024];
            // 4.定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可
            int len = 0;
            while ((len = is.read(buffer)) != -1){
                // 读出多少,倒出多少
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            System.out.println("复制成功...");
            e.printStackTrace();
        } finally {
            try {
                // 关闭字节输入输出流
                if(os != null)os.close();
                if(is != null)is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
