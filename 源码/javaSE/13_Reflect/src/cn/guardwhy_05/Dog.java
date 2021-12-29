package cn.guardwhy_05;
/**
 * Dog类
 */
public class Dog {
    // 成员变量
    private String name;
    // 无参构造器
    public Dog() {

    }
    // 带参构造器
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 成员方法
    public void run(){
        System.out.println("狗刨的很快...");
    }

    private void eat(String name){
        System.out.println("狗吃" + name);
    }

    // 静态方法
    public static void inAddr(){
        System.out.println("在学校吃骨头..");
    }
}
