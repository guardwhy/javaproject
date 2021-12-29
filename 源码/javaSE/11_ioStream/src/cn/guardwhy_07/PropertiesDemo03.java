package cn.guardwhy_07;

import java.io.FileOutputStream;
import java.util.Properties;

/**
 Properties：属性集对象。
     其实就是一个Map集合。也就是一个键值对集合。
     Properties代表的是一个属性文件，可以把键值对的数据存入到一个属性文件中去。
     属性文件：后缀是.properties结尾的文件。里面的内容都是 key=value。

 Properties的方法：
     -- public Object setProperty(String key, String value) ： 保存一对属性。
     -- public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值
     -- public Set<String> stringPropertyNames() ：所有键的名称的集合
     -- public void store(OutputStream out, String comments):保存数据到属性文件中去

总结：
     Properties是一个Map集合对象，
     Properties代表的是一个属性文件，可以把键值对的数据存入到一个属性文件中去。
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个属性集对象
        Properties pro = new Properties();
        pro.setProperty("userName", "guardwhy");
        pro.setProperty("passWord", "hxy162");

        System.out.println(pro.getProperty("userName"));
        // 2.把属性对象中的数据存入到一个属性文件中去保存起来，作为系统的配置信息
        /**
         * 参数一：保存数据的字节输出流管道
         * 参数二：保存心得
         */
        pro.store(new FileOutputStream("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test3\\users.properties")
        , "保存了账户和密码。。");
        System.out.println("保存成功..");
    }
}
