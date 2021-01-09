package day06;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author HP
 *
 */
public class Clinet {
	public static void main(String[] args) {
		/*
		 * 实例化Socket就是连接服务端的过程;
		 * Socket提供了构造方法
		 * Socket(InetAddress address,int port)
		 * 
		 * 参数1:服务端地址(IP)
		 * 参数2:服务端开启的端口
		 * 
		 * 通过服务IP地址可以找到服务端所处计算机,再通过端口找到
		 * 运行在服务端计算机上的服务端应用程序;
		 * 
		 * localhost:本机(IP:127.0.0.1)
		 * 查询本机IP地址:cmd --> ipconfig 查看自己电脑的IP地址
		 */
		try {
			Socket socket = new Socket("localhost",8088);
			System.out.println("客户端连接成功了!");
			/*
			 * Socket提供了方法:
			 * getOutputStream 返回 OutputStream
			 * 通过返回的字节流写出的数据会发送到给远端的计算机,对于客户端这边而言
			 * 远程计算机就是服务端了
			 * 
			 * getInputStream 返回 InputStream
			 * 
			 */
			//或获取输出流
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
			Scanner scanner = new Scanner(System.in);
			System.out.println("和服务端说话吧...");
			while(true){
				String message = scanner.next();
				pw.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
