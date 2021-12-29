package cn.guardwhy.singleDemo01;
// 静态内部类
public class Holder {
    // 1. 构造器
    private Holder(){

    }

    public  static  Holder getInstance(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
