package day04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * �����ļ�������������MP3
 * @author 86180
 *
 */
public class Buffer_CopyMp3 {
	public static void main(String[] args)throws Exception {
		//������
		FileInputStream fis = new FileInputStream("");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//�����
		FileOutputStream fos = new FileOutputStream("");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len = -1;
		long time1 = System.currentTimeMillis();
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("������ϣ�");
		System.out.println("��ʱ:" +(time2 - time1));
		bis.close();
		bos.close();
	}
}
