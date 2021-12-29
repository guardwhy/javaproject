package cn.guardwhy_05;

import java.io.*;
import java.util.*;

/**

 需求:把这个文章的段落恢复顺序,把恢复顺序的结果数据写出到另一个文件中去.

 分析:
 （1）定义一个缓冲字符输入流管道与源文件接通。
 （2）定义一个List集合存储文章的每一段数据。
 （3）按照行读取数据，把每行数据都存入到List集合中。
 （4）给List集合按照元素的顺序进行合理排序。
 （5）先定义一个缓冲字符输出流通向目标文件。
 （6）遍历List集合，把每行数据通过一个缓冲字符输出流写出到磁盘文件中去。
 */
public class ExecDemo03 {
    public static void main(String[] args) {
        try (// 1.定义一个缓冲字符输入流管道与源文件接通
             BufferedReader br = new BufferedReader(new FileReader("src/test2/abc1/a.txt"));
             // 2.先定义一个缓冲字符输出流通向目标文件。
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/test2/abc2/b.txt"));
             ){
            // 3.定义一个List集合存储文章的每一段数据
            List<String> lists1 = new ArrayList<>();
            // 4.按照行读取数据，把每行数据都存入到List集合中
            String line;
            while ((line = br.readLine()) != null){
                lists1.add(line);
            }
            System.out.println(lists1);

            // 5.自定义大小规则
            List<String> lists2 = new ArrayList<>();
            // 6.添加到集合
            Collections.addAll(lists2, "零","一","二","三","四","五","六","七","八","九","十");
            // 7.给List集合按照元素的顺序进行合理排序。
            Collections.sort(lists1, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return lists2.indexOf(o1.charAt(0) + "") - lists2.indexOf(o2.charAt(0) + "");
                }
            });
            System.out.println(lists1);
            // 8.遍历集合
            for(String In : lists1){
                bw.write(In);
                // 换行操作
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
