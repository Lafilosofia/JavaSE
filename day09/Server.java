package day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 聊天室服务端
 * 运行在服务端ServerSocket有两个主要作用:
 * 1.向系统申请对外的服务端口,客户端就是通过这个端口与服务端建立连接
 * 2.监听服务端端口,等待客户端连接,一旦一个客户端通过Socket与服务端建立连接,
 *   那么ServerSocket会创建一个Socket与该客户端通讯.
 * 
 * 注意:该端口号不能和其它程序端口号冲突,否则会抛出端口号被占用异常
 * 
 * @author Lenovo
 *
 */
public class Server {
	private ServerSocket server;
	private Socket socket;
	//private PrintWriter[] outAll=new PrintWriter[0];//所有客户端共享数据
	private List<PrintWriter> listOut = new ArrayList<PrintWriter>();
	ExecutorService pool = null;//线程池
	
	//服务端初始化
	public Server(){
		try{
			/*
			 * ServerSocket实例化后等待客户端连接
			 * 提供了一个构造方法是ServerSocket(int port)
			 */
			this.server = new ServerSocket(8088);
			this.pool = Executors.newFixedThreadPool(5);
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("连接异常...");
		}
	}
	
	public void start(){
		try {
			/*
			 * ServerSocket提供了一个accept();
			 * 该方法是一个阻塞方法,调用后即等待客户端的连接,一旦一个客户端
			 * 通过端口连接,那么accept方法会返回一个Socket实例,通过这个Socket实例就可以与
			 * 连接的客户端交互了
			 */
			while(true){
				System.out.println("等待客户端连接...");
				socket=server.accept();//阻塞作用
				//获取远端的IP地址
				InetAddress address = socket.getInetAddress();
				//获取远端的端口号
				int port = socket.getPort();
				System.out.println(port);
				System.out.println(address + ":连接上了!");
				//每一个客户端连接成功后生成一个socket
				ClinetHandler clinet = new ClinetHandler(socket);
				pool.execute(clinet);
				/*Thread t=new Thread(clinet);
				t.start();*/
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server s = new Server();
		s.start();
	}
	
	//内部类,此任务主要负责接收每一个客户端输入和输出
	class ClinetHandler implements Runnable {
		private Socket socket;//每个用户的socket
		private String host;//远程地址
		private int port;//远程端口
		public ClinetHandler(Socket socket){
			this.socket = socket;
			//获取远程地址
			InetAddress address = this.socket.getInetAddress();
			//将远程地址以字符串远程地址显示
			this.host = address.getHostAddress();
			this.port = this.socket.getPort();
		}
		
		public void run() {
			PrintWriter pw = null;
			try{
				/*
				 * 获取远端的IP地址
				 * Socket提供了一个获取远端的IP地址的方法getInetAddress()
				 * 返回InetAddress
				 */
				//获取输出流
				OutputStream out = socket.getOutputStream();
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
				//synchronized (listOut) {
					/*//对数组扩容
					outAll=Arrays.copyOf(outAll,outAll.length+1);
					//把每个客户端pw对象存入共享数组中的最后一个元素
					outAll[outAll.length-1]=pw;
					System.out.println("在线人数:"+outAll.length);*/
					Collections.synchronizedList(listOut);
					listOut.add(pw);
					System.out.println("在线人数:" + listOut.size());
				//}
				//获取输入流
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
				/*
				 * 客户端在断开连接是,不同的系统有不同的反应,
				 * Linux的客户端断开后,br.readLine()会返回null,
				 * Windows的客户端断开后,br.readLine()会直接抛出异常Connection reset
				 */
				String line = null;
				while((line=br.readLine()) != null){
					System.out.println(host + "," + port + "说:" + line);
					//synchronized (listOut) {
						//将当前客户端对应的输出流共享数据进行遍历
						/*for(int i=0;i<outAll.length;i++){
							PrintWriter p=outAll[i];
							p.println(line);
						}*/
						
						Collections.synchronizedList(listOut);
						//增强for循环
						for(PrintWriter p:listOut){
							p.println(line);
						}
					//}
					
				}
			} catch (Exception e) {
				//e.printStackTrace();
			} finally {
				/*
				 * 1.处理客户端断开后的操作,将该客户端的输出流
				 * 从共享数组中删除
				 */
				//synchronized (listOut) {
					/*for(int i=0;i<outAll.length;i++){
						if(outAll[i]==pw){
							outAll[i]=outAll[outAll.length-1];
							outAll=Arrays.copyOf(outAll, outAll.length-1);
							System.out.println("远程地址:"+host+",端口:"+port+":下线了!");
							System.out.println("在线人数是:"+outAll.length);
							break;
						}
					}*/
					Collections.synchronizedList(listOut);
					listOut.remove(pw);
					System.out.println("远程地址:" + host + ",端口:" + port  + ":下线了!");
					System.out.println("在线人数是:" + listOut.size());
				//}
				
				//2.客户端断开连接后,服务端关闭该客户Socket,释放资源
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	
}
