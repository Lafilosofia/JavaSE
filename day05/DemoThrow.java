package day05;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * throw:
 * �ɽ�RuntimeException�쳣�׸��ͻ���,
 * ǰ������Ҫ���ǵ��쳣��������RuntimeException�׳����쳣��Ϣ
 * @author HP
 *
 */
public class DemoThrow {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("hhh.txt");
		}catch(Exception e){
			//e.printStackTrace();//��־����
			/*
			 * throw new RuntimeException()
			 * һ��ִ��,����������ִ��
			 */
			throw new RuntimeException("��ȡʧ��,����ϵ��ع�����Ա...");
		}finally{
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
		System.out.println("�������!");
	}
}
