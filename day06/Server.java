package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 聊天室服务端
 * 运行在服务端ServerSocket有两个主要作用:
 * 1. 向系统申请对外的服务端口,客户端就是通过这个端口与服务端建立连接
 * 2. 监听服务端端口,等待客户端连接,一旦一个客户端通过Socket与服务端建立连接,
 *    那么ServerSocket会创建一个Socket与该客户端通讯.
 * 
 * 注意:该端口号不能和其它程序端口号冲突,否则会抛出端口号被占用异常
 * 
 * @author 86180
 *
 */
public class Server {
	public static void main(String[] args) {
		/*
		 * ServerSocket实例化后等待客户端连接
		 * 提供了一个构造方法ServerSocket(int port)
		 */
		try {
			ServerSocket server=new ServerSocket(8088);
			/*
			 * ServerSocket提供了一个accept();
			 * 该方法是一个阻塞方法,调用后即等待客户端的连接,一旦一个客户端
			 * 通过端口连接,那么accept方法会返回一个Socket实列,
			 * 通过这个Socket实例就可以与连接的客户端交互了
			 * 
			 */
				System.out.println("等待客户端连接...");
				Socket socket=server.accept();//阻塞作用
				/*
				 * 获取远端的IP地址
				 * Socket提供一个获取远端的IP地址的方法getInetAddress(),
				 * 返回InetAddress
				 */
				//获取远端的IP地址
				InetAddress address=socket.getInetAddress();
				//获取远程的端口号
				int port=socket.getPort();
				System.out.println(port);
				System.out.println(address+":连接上了");
				
				//获取输入流
				InputStream in=socket.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(in,"UTF-8"));
				String line=null;
				while((line=br.readLine())!=null){
					System.out.println(address+","+port+"说:"+line);
				}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

