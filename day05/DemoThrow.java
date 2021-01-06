package day05;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * throw:
 * 可将RuntimeException异常抛给客户端,
 * 前提是需要我们的异常类来捕获RuntimeException抛出的异常信息
 * @author HP
 *
 */
public class DemoThrow {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("hhh.txt");
		}catch(Exception e){
			//e.printStackTrace();//日志跟踪
			/*
			 * throw new RuntimeException()
			 * 一旦执行,程序不再往后执行
			 */
			throw new RuntimeException("读取失败,请联系相关工作人员...");
		}finally{
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
		System.out.println("程序结束!");
	}
}
