package cn.guardwhy_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 finnally关键字

用在捕获处理的异常格式中的。
     try{

     }catch(Exception e){
     e.printStackTrace();
     }finnally{
     // 无论代码是出现异常还是正常执行，最终一定要执行这里的代码！！
     }

    finnally：最后一定会执行一次！
总结：
 finnally无论程序正常执行还是异常执行，都要执行一次！
 一般是用来在程序执行结束后，进行资源的回收操作。
 */
public class FinnallyDemo01 {
    public static void main(String[] args) {
        System.out.println("程序开始....");
        divisionTest();
        System.out.println("程序结束....");
    }

    public static void divisionTest(){
        InputStream is = null;
        try {
            is = new FileInputStream("E:/www.jpg");
            int c = 10 / 2;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("算法处理完毕...");
            try {
                if(is != null)is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
