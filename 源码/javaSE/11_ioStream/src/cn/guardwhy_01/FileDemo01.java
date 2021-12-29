package cn.guardwhy_01;

import java.io.File;

/**
 File类：代表当前操作系统的文件对象。
 File类：是用来操作操作系统的文件对象的，删除文件，获取文件信息，创建文件（文件夹）...

 File类的创建对象的API:
     包：java.io.File
     （1）构造器：
     -- public File(String pathname)
     -- public File(String parent, String child)
     -- public File(File parent , String child)

 File类创建文件对象的格式:
     File f = new File("绝对路径/相对路径");
         绝对路径：从磁盘的的盘符一路走到目的位置的路径。
            -- 绝对路径依赖具体的环境，一旦脱离环境，代码可能出错！！
        相对路径: 去找工程中的文件才可以使用相对路径。
             -- 没有盘符，默认就是直接去工程下寻找文件的
             -- 能用相对路径就尽量用,相对路径在任何环境下都是没有问题的！

     File f = new File("文件路径/文件夹路径");
     广义来说操作系统认为文件包含：文件和文件夹。

总结:
 File创建文件对象；路径可以是绝对路径，相对路径，文件路径，文件夹路径。
 能有相对路径就用相对路径，相对路径只有项目中的文件才能用.
 */
public class FileDemo01 {
    public static void main(String[] args) {
        // 绝对路径
        File f1 = new File("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test1\\timg.jpg");
        System.out.println("图片长度:" + f1.length());

        // 相对路径:默认是相对到工程目录下直接寻找。
        File f2 = new File("src/test1/test01.txt");
        System.out.println("test01:" + f2.length());

        // 3. File f = new File("文件路径/文件夹路径");
        File f3 = new File("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test1");
        System.out.println("文件存在:" + f3.exists());
    }
}
