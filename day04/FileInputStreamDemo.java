package day04;

import java.io.FileInputStream;

/**
 * �ļ�������
 * FileInputStream(String str);
 * FileInputStream(File file);
 * @author 86180
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[] bytes=new byte[200];
		int len=fis.read(bytes);
		/*
		 * String(bytes,0,len,"UTF-8");
		 *bytes:��ȡbytes����;
		 *0:��0��ʼ��ȡ
		 *len:������ʵ�ʶ�ȡ�����ֽ���,
		 *"UTF-8":��"UTF-8"�����ȡ
		 */
		String str=new String(bytes,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}
}
