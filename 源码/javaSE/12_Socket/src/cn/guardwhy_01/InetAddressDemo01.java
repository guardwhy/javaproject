package cn.guardwhy_01;

import java.net.InetAddress;

/**
 InetAddress类成员方法
     * static InetAddress getLocalHost()
     * 获得本地主机IP地址对象
     * static InetAddress getByName(String host)
     * 根据IP地址字符串或主机名获得对应的IP地址对象

     * String getHostName();获得主机名
     * String getHostAddress();获得IP地址字符串
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception{
        // 1.获得本地主机IP地址对象
        InetAddress inet01 = InetAddress.getLocalHost();
        System.out.println("主机名/ip地址字符串:" + inet01);    // 主机名/ip地址字符串:GuardWhy/192.168.3.9

        // 2.根据IP地址字符串或主机名获得对应的IP地址对象
        InetAddress inet02 = InetAddress.getByName("www.baidu.com");
        System.out.println(inet02);

        // 3.获取主机名
        String hostName = inet01.getHostName();
        System.out.println("主机名:" + hostName);  // 主机名:GuardWhy

        // 4.获得IP地址字符串
        String hostAddress = inet01.getHostAddress();
        System.out.println("ip地址:" + hostAddress);  // ip地址:192.168.3.9

        // 5.测试与对方是否联通：ping命令的代码形式
        InetAddress inet03 = InetAddress.getByName("www.taobao1.com");
        boolean rs = inet03.isReachable(6000);
        System.out.println(rs); // true
    }
}
