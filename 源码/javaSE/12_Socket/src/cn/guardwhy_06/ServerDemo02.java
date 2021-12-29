package cn.guardwhy_06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * 服务端的功能：
 *      1.接收任意多个客户端的文件上传!!
 *      2.开始接收图片数据，复制到服务器路径：E:\workspace\Java\javaSE\12_Socket\src\test02
 */
public class ServerDemo02 {
    // 定义常量
    public static final String SERVER_PATH = "E:\\workspace\\Java\\javaSE\\12_Socket\\src\\test02\\";

    public static void main(String[] args) throws Exception{
        System.out.println("===服务器的启动===");
        // 注册端口
        ServerSocket serverSocket = new ServerSocket(7777);
        // 条件判断
        while (true){
            // 开始在这里暂停等待接收客户端的连接,得到一个端到端的Socket管道
            Socket socket = serverSocket.accept();
            new ServerReadThread(socket).start();
        }
    }
}

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
            BufferedInputStream bis = new BufferedInputStream(is);
            // 定义一个字节输出流通向服务器路径:随机指定一个文件名.
            OutputStream os = new FileOutputStream(ServerDemo02.SERVER_PATH + UUID.randomUUID()+ ".jpg");
            BufferedOutputStream bos = new BufferedOutputStream(os);
            // 开始复制
            byte[] buffer = new byte[1024];
            // 定义长度
            int len = 0;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
            bos.close();
            System.out.println("服务器接收图片成功:" + socket.getRemoteSocketAddress());
            // 响应数据回去
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("恭喜你,你上传的图片已经成功保存..");
            ps.flush();

            // 线程休眠
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
