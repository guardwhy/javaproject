package cn.guardwhy_01;

import java.io.File;

/**
 目标：文件搜索。

 去某个目录下，遍历所有的文件对象，找出自己想要的那个文件。
 Java默认只能支持一级文件对象的遍历，如果要搜索所有文件必须用递归思想。

 需求：是从E:/software目录下，找出eclipse.exe文件。

 */
public class FileSearchDemo06 {
    public static void main(String[] args) {
        // 定义搜索目录
        File dir = new File("E:/software");
        // 定义搜索方法
        searchFile(dir, "eclipse.exe");
    }

    /***
     * 搜索文件
     * @param dir
     * @param fileName
     */
    public static void searchFile(File dir, String fileName) {
        if(dir != null && dir.isDirectory()){
            // 1.先提取这个目录下的全部一级文件对象
            File[] files = dir.listFiles();
            // 2.判断这个目录是否有文件对象
            if(files != null && files.length > 0){
                // 3.遍历这些一级文件对象
                for (File f : files){
                    // 4.判断当前这个文件对象是文件还是文件夹
                    if(f.isFile()){
                        // 5.f是文件了，判断是否是我们想要的
                        if(f.getName().contains(fileName)){
                            System.out.println(f.getAbsolutePath());
                        }
                    }else {
                        // f是文件夹, 继续进入这个文件夹递归寻找文件对象.
                        searchFile(f, fileName);
                    }
                }
            }else {
                System.out.println("参数非法....");
            }
        }

    }
}
