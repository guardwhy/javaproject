package cn.guardwhy_05;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
Socket网络编程:

    功能1：客户端可以反复发，一个服务端可以接收无数个客户端的消息！！
总结：
 服务器如果想要接收多个客户端,那么必须引入线程,一个客户端一个线程处理
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception{
        System.out.println("===客户端的启动===");
        // 1.创建一个Socket的通信管道，请求与服务端的端口连接。
        Socket socket = new Socket("127.0.0.1", 7777);
        // 2.从Socket通信管道中得到一个字节输出流.
        OutputStream os = socket.getOutputStream();
        // 3.将字节流包装成打印流,进行数据的发送
        PrintStream ps = new PrintStream(os);
        // 4.开始发送信息
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请说:");
            String msg = sc.nextLine();
            // 打印消息
            ps.println(msg);
            // 刷新操作
            ps.flush();
        }
    }
}
