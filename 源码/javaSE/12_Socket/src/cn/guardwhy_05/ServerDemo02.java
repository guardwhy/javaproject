package cn.guardwhy_05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */

// 创建ServerReadThread对象
class ServerReadThread extends Thread{
    private Socket socket;

    // 带参构造器
    public ServerReadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 从Socket管道得到一个字节输入流
            InputStream is = socket.getInputStream();
            // 将字节输入流包装成字符缓冲输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 读取数据
            String line;
            while ((line = br.readLine()) != null){
                System.out.println("服务端收到:" + socket.getRemoteSocketAddress() + ":" + line);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            e.printStackTrace();
        }
    }
}
public class ServerDemo02 {
    public static void main(String[] args) throws Exception{
        System.out.println("===服务器的启动===");
        // 1.注册端口
        ServerSocket serverSocket = new ServerSocket(7777);
        while (true){
            // 开始在这里暂停等待接收客户端的连接,得到一个端到端的Socket管道
            Socket socket = serverSocket.accept();
            // 启动线程
            new ServerReadThread(socket).start();
            System.out.println(socket.getRemoteSocketAddress() + "上线了!!!");
        }
    }
}
