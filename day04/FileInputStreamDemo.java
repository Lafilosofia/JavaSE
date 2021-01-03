package day04;

import java.io.FileInputStream;

/**
 * 文件输入流
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
		 *bytes:读取bytes数组;
		 *0:从0开始读取
		 *len:截至到实际读取到的字节量,
		 *"UTF-8":以"UTF-8"编码读取
		 */
		String str=new String(bytes,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}
}
