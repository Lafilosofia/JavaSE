package day06;

import java.io.BufferedWriter;
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
public class Clinet {
	public static void main(String[] args) {
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
		try {
			Socket socket = new Socket("localhost",8088);
			System.out.println("�ͻ������ӳɹ���!");
			/*
			 * Socket�ṩ�˷���:
			 * getOutputStream ���� OutputStream
			 * ͨ�����ص��ֽ���д�������ݻᷢ�͵���Զ�˵ļ����,���ڿͻ�����߶���
			 * Զ�̼�������Ƿ������
			 * 
			 * getInputStream ���� InputStream
			 * 
			 */
			//���ȡ�����
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
			Scanner scanner = new Scanner(System.in);
			System.out.println("�ͷ����˵����...");
			while(true){
				String message = scanner.next();
				pw.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
