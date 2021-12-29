package cn.guardwhy_02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
UDP：用户数据报协议(User Datagram Protocol)。UDP协议是一个面向无连接的不可靠传输的协议。
     1.直接发消息给对象，不管对方是否在线，发消息后也不需要确认。
     2.无线（视频会议，通话），性能好，丢失一些数据！！

UDP协议的特点
     * 面向无连接的协议
     * 发送端只管发送，不确认对方是否能收到。
     * 基于数据包进行数据传输。
     * 发送数据的大小限制64K以内
     * 因为面向无连接，速度快，但是不可靠。会丢失数据！相对的！！

UDP协议的使用场景
     * 在线视频
     * 网络语音电话

UDP协议相关的两个类
     * DatagramPacket
     * 数据包对象
     * 作用：用来封装要发送或要接收的数据，比如：集装箱
     * DatagramSocket
     * 发送对象
     * 作用：用来发送或接收数据包，比如：码头

DatagramPacket类构造器
     * DatagramPacket(byte[] buf, int length, InetAddress address, int port)
     创建发送端数据包对象
     * buf：要发送的内容，字节数组
     * length：要发送内容的长度，单位是字节
     * address：接收端的IP地址对象
     * port：接收端的端口号

DatagramPacket(byte[] buf, int length)
     * 创建接收端的数据包对象
     * buf：用来存储接收到内容
     * length：能够接收内容的长度

DatagramPacket类常用方法
    *int getLength() 获得实际接收到的字节个数

DatagramSocket类构造方法
     * DatagramSocket() 创建发送端的Socket对象，系统会随机分配一个端口号。
     * DatagramSocket(int port) 创建接收端的Socket对象并指定端口号

DatagramSocket类成员方法
     * void send(DatagramPacket dp) 发送数据包
     * void receive(DatagramPacket p) 接收数据包
 */
public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个数据包对象,封装要发送的数据.
        byte[] bytes = "hello,Server".getBytes();

        /**
         * 参数一:发送数据的字节数组
         * 参数二:字节数组的长度
         * 参数三: 服务器的IP地址
         * 参数四: 服务器的端口号
         */
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.3.9"), 9999);
        // 2.直接把这个数据包发出去,指定了客户端的端口对象
        DatagramSocket socket = new DatagramSocket(8888);
        // 3.开始发送
        socket.send(packet);
        System.out.println("客户端发送完毕.....");
    }
}
