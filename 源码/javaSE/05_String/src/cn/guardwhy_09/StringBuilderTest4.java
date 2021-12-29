package cn.guardwhy_09;

public class StringBuilderTest4 {
    public static void main(String[] args) {
        // 1.创建sb对象
        StringBuilder sb = new StringBuilder("abcd1234helloABCDworld");
        // 2.表示删除下标为8的单个字符
        sb.deleteCharAt(8);
        System.out.println("sb(删除下标为8):" +sb); // sb(删除下标为8):abcd1234elloABCDworld

        //3.使用for循环删除多个字符
        for (int i = 8; i < 12; i++) {
            // 始终删除下标为8的字符
            sb.deleteCharAt(8);
        }
        System.out.println("sb(删除下标8~12)："+sb); // sb(删除下标8~12)：abcd1234ABCDworld
        System.out.println("------------------------");

        // 4. 删除起始字符串abcd，包含0但不包含4
        sb.delete(0, 4);
        System.out.println("sb(删除0,4下标)=" +sb); // sb(删除0,4下标)=1234ABCDworld

        // 5. 删除中间字符串
        sb.delete(4, 8);
        System.out.println("sb(删除4,8下标) = " + sb); // sb(删除4,8下标) = 1234world

        // 6. 删除末尾字符串
        sb.delete(4, sb.length());
        System.out.println("sb(删除末尾字符串) = " + sb); // sb(删除末尾字符串) = 1234
        System.out.println("------------------------");
    }
}
