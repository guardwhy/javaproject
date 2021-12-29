package cn.guardwhy.juc02;

import java.util.function.Supplier;
/*
Supplier 供给型接口,没有参数，只有返回值。
*/
public class SupplierDemo04 {
    public static void main(String[] args) {
        /*Supplier supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                System.out.println("get()方法");
                return 666;
            }
        };*/

        // 表达式
        Supplier supplier = ()->{
            return 666;
        };
        System.out.println(supplier.get());
    }
}
