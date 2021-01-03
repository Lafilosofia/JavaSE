package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * BufferedReader
 * @author 86180
 *
 */
public class BufferReaderDemo {
	public static void main(String[] args)throws Exception {
		//输入字节流
		//FileInputStream fis=new FileInputStream("pw2.txt");
		
		//输入转换流
	//	InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		
		//输入字符流
	//	BufferedReader br=new BufferedReader(isr);
		BufferedReader br=new BufferedReader(
				new InputStreamReader(
						new FileInputStream("pw2.txt"),"UTF-8")
				);
		/*
		 *BufferedReader提供了 String readLine()方法.
		 *连续读取若干字符,直到读取到换行符为止,然后将换行符之前读取的
		 *字符以一个字符串形式返回.
		 *注意,返回字符串中不含有最后读到的换行符,
		 *若返回值为null,则表示读到末尾
		 * 
		 */
		String line=null;//每一行读到的数据
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
