package cn.guardwhy_04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class ServerDemo02 {
    public static void main(String[] args) throws Exception{
        System.out.println("===服务器的启动===");
        // 1.注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        // 开始在这里暂停等待接收客户端的连接,得到一个端到端的Socket管道
        Socket socket = serverSocket.accept();
        // 从Socket管道得到一个字节输入流
        InputStream is = socket.getInputStream();
        // 将字节输入流包装成字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 读取数据
        String line;
        while ((line = br.readLine()) != null){
            System.out.println("服务端收到:" + line);
        }
    }
}
