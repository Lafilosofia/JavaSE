package day04;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws Exception{
		//输入字节流
		FileInputStream fis = new FileInputStream("osw.txt");
		/*
		 * byte[] b = new byte[50];
		 * fis.read(b);
		 * System.out.println(new String(b,"UTF-8"));
		 */
		
		//转换输入流
		InputStreamReader isr = new InputStreamReader(fis,"UFT-8");
		char[] c = new char[50];
		int n = isr.read(c);//实际读到的字符量
		System.out.println(n);
		String str = new String(c,0,n);
		System.out.println(str);
		
		int d = isr.read();
		
	}
}
