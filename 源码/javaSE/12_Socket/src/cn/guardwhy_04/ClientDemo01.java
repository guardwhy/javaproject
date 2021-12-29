package cn.guardwhy_04;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 功能1：客户端可以反复发消息，服务端可以反复收消息
小结：
 通信是很严格的，对方怎么发你就怎么收，对方发多少你就只能收多少.
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception{
        System.out.println("===客户端的启动===");
        // 1.创建一个Socket的通信管道，请求与服务端的端口连接。
        Socket socket = new Socket("127.0.0.1", 8888);
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
