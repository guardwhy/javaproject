package cn.annotation_01;

import java.util.ArrayList;
import java.util.List;

public class Annotation01 extends Object{
    // 1.重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    // 2.方法过时了,不建议使用,可能存在问题,并不是不能使用!
    @Deprecated
    public static void test01(){
        System.out.println("测试 @Deprecated");
    }

    //3. 发现 参数类型和参数名称,并不是方法!
   @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList<>();
   }

    public static void main(String[] args) {
        // 调用方法
        test01();
    }
}
