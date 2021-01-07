package day05;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * JDK1.7֮���Ƴ���һ���µ�����,�Զ��ر�
 * @author HP
 *
 */
public class DemoTryCatch03 {
	public static void main(String[] args) {
		/*
		 * AutoCloseable�ӿڵ�������Զ���������
		 * �Զ��ر��﷨�Ǳ������Ͽ�,������class�ļ������Ĺرջ�����finally�н��е�
		 */
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ceshi.txt"))));){
			pw.println("ףԸȫ�������е�ĸ�׽��տ���,���ƴ��Լ���ĸ��");
			System.out.println("д�����!");
			
		}catch(Exception e){
			e.printStackTrace();//��־����
		}
		
		/*FileInputStream fis=null;
		try{
			fis=new FileInputStream("pw.txt");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}*/
		
		
		
	}
}
