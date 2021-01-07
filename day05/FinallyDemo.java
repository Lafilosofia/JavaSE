package day05;
/**
 *  �������е��쳣�������ͷ�����Դ
 */
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("osw.txt");
			byte[] bytes = new byte[100];
			int len = fis.read(bytes);
			System.out.println(new String(bytes,0,len,"UTF-8"));
		}catch(Exception e){
			System.out.println("��ȡ�ļ��쳣...");
			e.printStackTrace();//��־����
		}finally{
			try {
				if(fis != null){
					System.out.println("�ر���,�ͷ���Դ");
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
