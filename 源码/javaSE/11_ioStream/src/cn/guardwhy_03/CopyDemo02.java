package cn.guardwhy_03;

import java.io.*;

/**
 JDK 1.7开始关闭资源的新方式：try-with-resources

     try(
     // 这里只能放置资源对象，用完会自动调用资源的close()方法关闭。
     ){

     }catch (Exception e){
     e.printStackTrace();
     }

     资源：是实现了Closeable接口的类就是资源。就需要释放！
 */
public class CopyDemo02 {
    public static void main(String[] args) {
        try (// 1.定义一个字节输入流管道与源文件接通
             InputStream is = new FileInputStream("src/test1/aaa/my.jpg");
             // 2.定义一个字节输出流管道与目标文件接通
             OutputStream os = new FileOutputStream("src/test1/abc/newMy1.jpg");
             ){
            // 3.定义一个字节数组
            byte[] buffer = new byte[1024];
            // 4.定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可
            int len = 0;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            System.out.println("复制成功...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
