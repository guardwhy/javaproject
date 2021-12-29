package cn.guardwhy_01;

import java.io.File;

/**
File类的判断功能的方法
 - public boolean exists() ：此File表示的文件或目录是否实际存在。
 - public boolean isDirectory() ：此File表示的是否为目录。
 - public boolean isFile() ：此File表示的是否为文件
 */
public class FileDemo03 {
    public static void main(String[] args) {
        // 1.定义一个文件对象
        File f1 = new File("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test1\\timg.jpg");
        // 检测路径是否存在的。检测文件是否存在
        System.out.println(f1.exists()); // true
        // 判断文件对象是否是文件,是文件返回true,反之false
        System.out.println(f1.isFile()); // true
        // 判断文件对象是否是文件夹
        System.out.println(f1.isDirectory());    // false

        // 定义一个文件对象
        File f2 = new File("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test1");
        // 检测路径是否存在的。检测文件是否存在
        System.out.println(f2.exists());    // true
        // 判断文件对象是否是文件
        System.out.println(f2.isFile());  // false
        // 判断文件对象是否是文件夹
        System.out.println(f1.isDirectory());   // false
    }
}
