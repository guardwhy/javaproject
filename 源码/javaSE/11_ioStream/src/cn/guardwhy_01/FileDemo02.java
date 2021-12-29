package cn.guardwhy_01;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 File类的获取功能的API
     - public String getAbsolutePath():返回此File的绝对路径名字符串。
     - public String getPath():获取创建文件对象的时候用的路径
     - public String getName():返回由此File表示的文件或目录的名称。
     - public long length():返回由此File表示的文件的长度。
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // 1.定义一个文件对象
        File f = new File("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test1\\timg.jpg");
        // 获取当前文件对象的绝对路径的字符串
        System.out.println("路径:" + f.getAbsolutePath());  // :E:\workspace\Java\javaSE\11_ioStream\src\test1\timg.jpg
        // 获取创建文件对象的时候用的路径
        System.out.println("创建文件对象的时候用的路径:" + f.getPath()); // E:\workspace\Java\javaSE\11_ioStream\src\test1\timg.jpg
        // 获取当前文件对象的名称
        System.out.println("文件对象的名称:" + f.getName());   // timg.jpg
        // 获取文件的大小（字节总数大小）
        System.out.println("字节总数大小:" + f.length()); // 19383
        System.out.println("+++++++++++++++++==+++++++");
        // 2.创建一个文件对象
        File f1 = new File("src/guardwhy");
        // 获取当前文件对象的绝对路径的字符串
        System.out.println("绝对路径:" + f1.getAbsolutePath()); // E:\workspace\Java\javaSE\src\guardwhy
        // 获取创建文件对象的时候用的路径
        System.out.println("创建文件对象的时候用的路径:" + f1.getPath());    // src\guardwhy
        // 获取当前文件对象的名称
        System.out.println("文件对象的名称:" + f1.getName());  // guardwhy
        // 获取文件的大小（字节总数大小）
        System.out.println("字节总数大小:" + f1.length());    // 0
        System.out.println("++++++++++++++++++++++++++++++++");

        // 获取它的上级目录的字符串
        System.out.println("上级目录:" + f.getParent());    // E:\workspace\Java\javaSE\11_ioStream\src\test1
        // 获取它的上级目录的文件对象
        System.out.println("上级目录的文件对象:"+ f.getParentFile()); // 上级目录的文件对象:E:\workspace\Java\javaSE\11_ioStream\src\test1
        // 获取文件的最后修改时间
        long time = f.lastModified(); // 时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println("格式化时间:" + sdf.format(time));    // 格式化时间:2020-06-29 17:58:56 星期一 下午
    }
}
