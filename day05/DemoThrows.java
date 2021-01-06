package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * throws 
 * 在方法上抛出异常，要求调用方法来解决这个异常
 * 注意：throws不要在主程序main方法上抛出
 * 
 * 调用方抛出的异常必须是大于或等于被调用方抛出的异常
 * @author 86180
 *
 */
public class DemoThrows {
	public static void testRead() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("pw.txt");
	}
	
	public static void test() throws FileNotFoundException{
		testRead();
	}
	public static void main(String[] args) throws FileNotFoundException{
		testRead();
		
		try{
			test();
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
		}	
	}
}
