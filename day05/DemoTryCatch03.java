package day05;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * JDK1.7之后推出了一个新的特性,自动关闭
 * @author HP
 *
 */
public class DemoTryCatch03 {
	public static void main(String[] args) {
		/*
		 * AutoCloseable接口的子类可以定义在这里
		 * 自动关闭语法是编译器认可,编译后的class文件中流的关闭还是在finally中进行的
		 */
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ceshi.txt"))));){
			pw.println("祝愿全天下所有的母亲节日快乐,请善待自己的母亲");
			System.out.println("写入完毕!");
			
		}catch(Exception e){
			e.printStackTrace();//日志跟踪
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
