package day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
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
public class Clinet2 {
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
	private Socket socket;
	
	public Clinet2(){//客户端初始化
		try{
			this.socket = new Socket("localhost",8088);
			System.out.println("客户端连接成功了!");
		}catch(Exception e){
			
		}
	}
	
	//启动客户端方法
	private void start(){
		Scanner scanner = null;
		try {
			/*
			 * Socket提供了方法:
			 * getOutputStream 返回 OutputStream
			 * 通过返回的字节流写出的数据会发送到给远端的计算机,对于客户端这边而言
			 * 远程计算机就是服务端了
			 * 
			 * getInputStream 返回 InputStream
			 * 
			 */
			ServerHandler2 server = new ServerHandler2(socket);
			//该线程负责接收服务端发送过来的消息
			Thread t = new Thread(server);
			t.start();
			
			//或获取输出流
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
			scanner = new Scanner(System.in);
			System.out.println("和服务端说话吧...");
			while(true){
				String message = scanner.next();
				pw.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
	
	public static void main(String[] args) {
		Clinet2 clinet = new Clinet2();
		clinet.start();
	}
}


//该任务负责接收服务端发送过来的消息
class ServerHandler2 implements Runnable {
	private Socket socket;
	
	public ServerHandler2(Socket socket){
		this.socket = socket;
	} 
	
	@Override
	public void run() {
		try {
			InputStream in = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println("服务端说:" + line);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("服务端异常,请稍等...");
		}
	}
	
}