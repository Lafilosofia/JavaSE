package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * �����ҷ����
 * �����ڷ����ServerSocket��������Ҫ����:
 * 1. ��ϵͳ�������ķ���˿�,�ͻ��˾���ͨ������˿������˽�������
 * 2. ��������˶˿�,�ȴ��ͻ�������,һ��һ���ͻ���ͨ��Socket�����˽�������,
 *    ��ôServerSocket�ᴴ��һ��Socket��ÿͻ���ͨѶ.
 * 
 * ע��:�ö˿ںŲ��ܺ���������˿ںų�ͻ,������׳��˿ںű�ռ���쳣
 * 
 * @author 86180
 *
 */
public class Server {
	public static void main(String[] args) {
		/*
		 * ServerSocketʵ������ȴ��ͻ�������
		 * �ṩ��һ�����췽��ServerSocket(int port)
		 */
		try {
			ServerSocket server=new ServerSocket(8088);
			/*
			 * ServerSocket�ṩ��һ��accept();
			 * �÷�����һ����������,���ú󼴵ȴ��ͻ��˵�����,һ��һ���ͻ���
			 * ͨ���˿�����,��ôaccept�����᷵��һ��Socketʵ��,
			 * ͨ�����Socketʵ���Ϳ��������ӵĿͻ��˽�����
			 * 
			 */
				System.out.println("�ȴ��ͻ�������...");
				Socket socket=server.accept();//��������
				/*
				 * ��ȡԶ�˵�IP��ַ
				 * Socket�ṩһ����ȡԶ�˵�IP��ַ�ķ���getInetAddress(),
				 * ����InetAddress
				 */
				//��ȡԶ�˵�IP��ַ
				InetAddress address=socket.getInetAddress();
				//��ȡԶ�̵Ķ˿ں�
				int port=socket.getPort();
				System.out.println(port);
				System.out.println(address+":��������");
				
				//��ȡ������
				InputStream in=socket.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(in,"UTF-8"));
				String line=null;
				while((line=br.readLine())!=null){
					System.out.println(address+","+port+"˵:"+line);
				}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

