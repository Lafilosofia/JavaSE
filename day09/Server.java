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
 * �����ҷ����
 * �����ڷ����ServerSocket��������Ҫ����:
 * 1.��ϵͳ�������ķ���˿�,�ͻ��˾���ͨ������˿������˽�������
 * 2.��������˶˿�,�ȴ��ͻ�������,һ��һ���ͻ���ͨ��Socket�����˽�������,
 *   ��ôServerSocket�ᴴ��һ��Socket��ÿͻ���ͨѶ.
 * 
 * ע��:�ö˿ںŲ��ܺ���������˿ںų�ͻ,������׳��˿ںű�ռ���쳣
 * 
 * @author Lenovo
 *
 */
public class Server {
	private ServerSocket server;
	private Socket socket;
	//private PrintWriter[] outAll=new PrintWriter[0];//���пͻ��˹�������
	private List<PrintWriter> listOut = new ArrayList<PrintWriter>();
	ExecutorService pool = null;//�̳߳�
	
	//����˳�ʼ��
	public Server(){
		try{
			/*
			 * ServerSocketʵ������ȴ��ͻ�������
			 * �ṩ��һ�����췽����ServerSocket(int port)
			 */
			this.server = new ServerSocket(8088);
			this.pool = Executors.newFixedThreadPool(5);
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("�����쳣...");
		}
	}
	
	public void start(){
		try {
			/*
			 * ServerSocket�ṩ��һ��accept();
			 * �÷�����һ����������,���ú󼴵ȴ��ͻ��˵�����,һ��һ���ͻ���
			 * ͨ���˿�����,��ôaccept�����᷵��һ��Socketʵ��,ͨ�����Socketʵ���Ϳ�����
			 * ���ӵĿͻ��˽�����
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				socket=server.accept();//��������
				//��ȡԶ�˵�IP��ַ
				InetAddress address = socket.getInetAddress();
				//��ȡԶ�˵Ķ˿ں�
				int port = socket.getPort();
				System.out.println(port);
				System.out.println(address + ":��������!");
				//ÿһ���ͻ������ӳɹ�������һ��socket
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
	
	//�ڲ���,��������Ҫ�������ÿһ���ͻ�����������
	class ClinetHandler implements Runnable {
		private Socket socket;//ÿ���û���socket
		private String host;//Զ�̵�ַ
		private int port;//Զ�̶˿�
		public ClinetHandler(Socket socket){
			this.socket = socket;
			//��ȡԶ�̵�ַ
			InetAddress address = this.socket.getInetAddress();
			//��Զ�̵�ַ���ַ���Զ�̵�ַ��ʾ
			this.host = address.getHostAddress();
			this.port = this.socket.getPort();
		}
		
		public void run() {
			PrintWriter pw = null;
			try{
				/*
				 * ��ȡԶ�˵�IP��ַ
				 * Socket�ṩ��һ����ȡԶ�˵�IP��ַ�ķ���getInetAddress()
				 * ����InetAddress
				 */
				//��ȡ�����
				OutputStream out = socket.getOutputStream();
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
				//synchronized (listOut) {
					/*//����������
					outAll=Arrays.copyOf(outAll,outAll.length+1);
					//��ÿ���ͻ���pw������빲�������е����һ��Ԫ��
					outAll[outAll.length-1]=pw;
					System.out.println("��������:"+outAll.length);*/
					Collections.synchronizedList(listOut);
					listOut.add(pw);
					System.out.println("��������:" + listOut.size());
				//}
				//��ȡ������
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
				/*
				 * �ͻ����ڶϿ�������,��ͬ��ϵͳ�в�ͬ�ķ�Ӧ,
				 * Linux�Ŀͻ��˶Ͽ���,br.readLine()�᷵��null,
				 * Windows�Ŀͻ��˶Ͽ���,br.readLine()��ֱ���׳��쳣Connection reset
				 */
				String line = null;
				while((line=br.readLine()) != null){
					System.out.println(host + "," + port + "˵:" + line);
					//synchronized (listOut) {
						//����ǰ�ͻ��˶�Ӧ��������������ݽ��б���
						/*for(int i=0;i<outAll.length;i++){
							PrintWriter p=outAll[i];
							p.println(line);
						}*/
						
						Collections.synchronizedList(listOut);
						//��ǿforѭ��
						for(PrintWriter p:listOut){
							p.println(line);
						}
					//}
					
				}
			} catch (Exception e) {
				//e.printStackTrace();
			} finally {
				/*
				 * 1.����ͻ��˶Ͽ���Ĳ���,���ÿͻ��˵������
				 * �ӹ���������ɾ��
				 */
				//synchronized (listOut) {
					/*for(int i=0;i<outAll.length;i++){
						if(outAll[i]==pw){
							outAll[i]=outAll[outAll.length-1];
							outAll=Arrays.copyOf(outAll, outAll.length-1);
							System.out.println("Զ�̵�ַ:"+host+",�˿�:"+port+":������!");
							System.out.println("����������:"+outAll.length);
							break;
						}
					}*/
					Collections.synchronizedList(listOut);
					listOut.remove(pw);
					System.out.println("Զ�̵�ַ:" + host + ",�˿�:" + port  + ":������!");
					System.out.println("����������:" + listOut.size());
				//}
				
				//2.�ͻ��˶Ͽ����Ӻ�,����˹رոÿͻ�Socket,�ͷ���Դ
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	
}
