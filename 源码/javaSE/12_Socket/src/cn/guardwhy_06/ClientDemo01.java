package cn.guardwhy_06;

import java.io.*;
import java.net.Socket;

/**
 目标： 客户端。

 需求：客户端可以反复的上传jpg的图片，给服务器存储起来。

 分析：
 （1）提供客户端，上传一张本地图片：xxx.jpg.
 （2）提供服务端，存储图片的仓库路径：E:\workspace\Java\javaSE\12_Socket\src\test02
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception{
        // a.先得到与服务端的Socket通信管道连接
        Socket socket = new Socket("192.168.3.9", 7777);
        // b.得到一个字节输出流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        // c.定位本地图片,上传到服务器
        InputStream is = new FileInputStream("E:\\workspace\\Java\\javaSE\\12_Socket\\src\\test01\\my.jpg");
        BufferedInputStream bis = new BufferedInputStream(is);

        // d.使用缓冲字节流复制,定义一个字节数组,来复制图片字节给服务器端
        byte[] buffer = new byte[1024];
        // 定义长度
        int len = 0;
        while ((len = bis.read()) != -1){
            bos.write(buffer, 0, len);
        }
        bos.flush();
        // 客户端通过Socket通知服务器.
        socket.shutdownOutput();

        // 接收服务端响应的消息,要得到上传的结果
        // 从Socket通信管道中得到一个字节输入流,把字节输入流包装成一个缓冲字符输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("上传结果:" + br.readLine());
    }
}
