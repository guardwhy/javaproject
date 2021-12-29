package cn.guardwhy_01;

import java.io.File;

/**
File类的创建和删除的方法
     - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     - public boolean delete() ：删除由此File表示的文件或目录。 （只能删除空目录）
     - public boolean mkdir() ：创建由此File表示的目录。（只能创建一级目录）
     - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class FileDemo04 {
    public static void main(String[] args) throws Exception{
        // 定义文件对象
        File f1 = new File("src/test1/test01.txt");
        // 创建一个新文件对象,因为以后文件都是可以自动创建的
        System.out.println(f1.createNewFile());

        // 删除文件对象
        System.out.println(f1.delete());
        // delete如果删除文件夹，只能删除空文件夹
        File f2 = new File("src/test1/test2");
        System.out.println(f2.delete());    // true

        // 创建一个文件夹
        File f3 = new File("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test1\\aaa");
        System.out.println(f3.mkdir()); // true

    }
}
