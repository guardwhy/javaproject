package cn.guardwhy_07;

import java.io.FileInputStream;
import java.util.Properties;

/**
Properties读取属性文件。

 Properties的方法：
     -- public Object setProperty(String key, String value) ： 保存一对属性。
     -- public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值
     -- public Set<String> stringPropertyNames() ：所有键的名称的集合
     -- public void store(OutputStream out, String comments):保存数据到属性文件中去
     -- public synchronized void load(InputStream inStream):加载属性文件的数据到属性集对象中去
总结：
     Properties属性集对象可以通过load方法加载属性集文件中的数据到属性集对象中去！
 */
public class PropertiesDemo04 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个属性集对象
        Properties pro = new Properties();
        // 2.加载属性文件的数据注入到对象pro中去
        pro.load(new FileInputStream("E:\\workspace\\Java\\javaSE\\11_ioStream\\src\\test3\\users.properties"));
        // 3.输出pro对象
        System.out.println(pro);
    }
}
