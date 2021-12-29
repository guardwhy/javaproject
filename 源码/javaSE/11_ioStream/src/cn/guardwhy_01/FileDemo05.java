package cn.guardwhy_01;

import java.io.File;

/**
File目录的遍历
     - public String[] list()：
     获取当前目录下所有的一级文件名称到一个字符串数组中去返回。
     - public File[] listFiles()(常用)：
     获取当前目录下所有的一级文件对象到一个文件对象数组中去返回
总结:
    这些API只能得到一级文件对象操作。
 */
public class FileDemo05 {
    public static void main(String[] args) {
        // 定位一个目录
        File f = new File("src/cn");
        // 获取当前目录下所有的一级文件名称到一个字符串数组中去
        String[] names = f.list();
        // 遍历操作
        for(String n : names){
            System.out.println(n);
        }

        // 获取当前目录下所有的一级文件对象到一个文件对象数组中去返回。
        File[] files = f.listFiles();
        for(File f1 : files){
            System.out.println(f1.getAbsolutePath());
        }
    }
}
