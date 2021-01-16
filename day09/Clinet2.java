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
 * �����ҿͻ���
 * @author HP
 *
 */
public class Clinet2 {
	/*
	 * ʵ����Socket�������ӷ���˵Ĺ���;
	 * Socket�ṩ�˹��췽��
	 * Socket(InetAddress address,int port)
	 * 
	 * ����1:����˵�ַ(IP)
	 * ����2:����˿����Ķ˿�
	 * 
	 * ͨ������IP��ַ�����ҵ���������������,��ͨ���˿��ҵ�
	 * �����ڷ���˼�����ϵķ����Ӧ�ó���;
	 * 
	 * localhost:����(IP:127.0.0.1)
	 * ��ѯ����IP��ַ:cmd --> ipconfig �鿴�Լ����Ե�IP��ַ
	 */
	private Socket socket;
	
	public Clinet2(){//�ͻ��˳�ʼ��
		try{
			this.socket = new Socket("localhost",8088);
			System.out.println("�ͻ������ӳɹ���!");
		}catch(Exception e){
			
		}
	}
	
	//�����ͻ��˷���
	private void start(){
		Scanner scanner = null;
		try {
			/*
			 * Socket�ṩ�˷���:
			 * getOutputStream ���� OutputStream
			 * ͨ�����ص��ֽ���д�������ݻᷢ�͵���Զ�˵ļ����,���ڿͻ�����߶���
			 * Զ�̼�������Ƿ������
			 * 
			 * getInputStream ���� InputStream
			 * 
			 */
			ServerHandler2 server = new ServerHandler2(socket);
			//���̸߳�����շ���˷��͹�������Ϣ
			Thread t = new Thread(server);
			t.start();
			
			//���ȡ�����
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
			scanner = new Scanner(System.in);
			System.out.println("�ͷ����˵����...");
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


//����������շ���˷��͹�������Ϣ
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
				System.out.println("�����˵:" + line);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("������쳣,���Ե�...");
		}
	}
	
}