package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * throws 
 * �ڷ������׳��쳣��Ҫ����÷������������쳣
 * ע�⣺throws��Ҫ��������main�������׳�
 * 
 * ���÷��׳����쳣�����Ǵ��ڻ���ڱ����÷��׳����쳣
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
