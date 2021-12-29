package cn.guardwhy_02;

import jdk.swing.interop.SwingInterOpUtils;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 服务器
 */
public class UDPServerDemo02 {
    public static void main(String[] args) throws Exception{
        // 1.创建接收对象DatagramSocket: 注册端口9999
        DatagramSocket socket = new DatagramSocket(9999);
        // 2.定义一个数据包对象(集装箱)用于接收客户端发来的数据
        byte[] buffer = new byte[64*1024];
        /**
         * 参数一：接收数据的字节数组
         * 参数二：接收数据的字节数组的长度
         */
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        // 3.开始接收数据
        socket.receive(packet);

        // 4.得到当前接收的数据字节数
        int len = packet.getLength();
        // 5.接收多少输出多少
        System.out.println(new String(buffer, 0, len));
        // 6.获得发送端的ip地址
        String sendIp = packet.getAddress().getHostAddress();
        System.out.println("ip地址:" + sendIp);

        // 7.获得发送端的端口号
        int port = packet.getPort();
        System.out.println("端口号:" + port);
    }
}
