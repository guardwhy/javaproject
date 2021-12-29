package cn.guardwhy_04;

import java.io.*;

/**
 目标：测试缓冲流读写数据的性能如何。

 需求：把一个视频复制到另一个地方。

 分别做以下几个案例：
 （1）用原始的字节流，然后用一个字节数组（桶），循环的进行字节复制。
 （2）使用缓冲字节流进行一个一个字节的复制。
 （3）使用缓冲字节流，然后用一个字节数组（桶），循环的进行字节复制。
 分别统计他们花费的时间性能，得到结论。
总结：
    建议以后进行字节数据的读写，使用缓冲字节流结合字节数组进行数据的读写，性能是最高的！！
 */
public class CopyTimerDemo03 {
    // 定义常量SRC_FILE
    public static final String SRC_FILE = "E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test2\\abc1\\01.mp4";
    // 定义常量DEST_FILE
    public static final String DEST_FILE = "E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test2\\abc2\\";

    public static void main(String[] args) {
        // 调用方法
        copy01();   // 原始字节流进行数组的复制。(1.86s)
        copy02();   // 缓冲字节流进行一个一个字节的复制。(1.835s)
        copy03();   // 缓冲字节流进行数组的复制的(0.483s)
    }

    /**
     * 用原始的字节流，然后用一个字节数组（桶），循环的进行字节复制。
     */
    public static void copy01() {
        // 开始时间
        long startTime1 = System.currentTimeMillis();
        try (// 创建一个字节输入流管道与源文件接通
             InputStream is = new FileInputStream(SRC_FILE);
             // 创建一个字节输出流管道与目标文件的路径接通
             OutputStream os = new FileOutputStream(DEST_FILE + "02.mp4");
        ){
            // 定义一个变量存储一个字节
            byte[] buffer = new byte[1024];
            // 每次字节数组读取到的字节数
            int len = 0;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 结束时间
        long endTime1 = System.currentTimeMillis();
        System.out.println("原始字节流字节数组复制:" + (endTime1 - startTime1) / 1000.0 + "s");  // 原始字节流字节数组复制:1.86s
    }

    /**
     * 使用缓冲字节流进行一个一个字节的复制。
     */
    public static void copy02() {
        // 开始时间
        long startTime2 = System.currentTimeMillis();
        try (// 创建一个字节输入流管道与源文件接通
             InputStream is = new FileInputStream(SRC_FILE);
             BufferedInputStream bis = new BufferedInputStream(is);
             // 创建一个字节输出流管道与目标文件的路径接通
             OutputStream os = new FileOutputStream(DEST_FILE + "03.mp4");
             BufferedOutputStream bos = new BufferedOutputStream(os);
        ){
            // 定义一个变量存储一个字节
            int ch = 0;
            while ((ch = bis.read()) != -1){
                bos.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 结束时间
        long endTime2 = System.currentTimeMillis();
        System.out.println("缓冲字节流一个一个字节复制:" + (endTime2 - startTime2) / 1000.0 + "s");
    }
    /**
     * 使用缓冲字节流，然后用一个字节数组（桶），循环的进行字节复制。
     */
    public static void copy03() {
        // 开始时间
        long startTime3 = System.currentTimeMillis();
        try (
            // 创建一个字节输入流管道与源文件接通
             InputStream is = new FileInputStream(SRC_FILE);
             BufferedInputStream bis = new BufferedInputStream(is);
             // 创建一个字节输出流管道与目标文件的路径接通
             OutputStream os = new FileOutputStream(DEST_FILE + "04.mp4");
             BufferedOutputStream bos = new BufferedOutputStream(os);
        ){
            // 定义一个变量存储一个字节
            byte[] buffer = new byte[1024];
            // 每次字节数组读取到的字节数
            int len = 0;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 结束时间
        long endTime3 = System.currentTimeMillis();
        System.out.println("缓冲字节流字节数组复制:" + (endTime3 - startTime3) / 1000.0 + "s");
    }
}
