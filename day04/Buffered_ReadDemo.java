package day04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * �ļ���������ȡ
 * @author 86180
 *
 */
public class Buffered_ReadDemo {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("bos.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		byte[] data=new byte[200];
		int len=fis.read(data);
		String str=new String(data,0,len,"UTF-8");
		System.out.println(str);
		bis.close();
	}
}
