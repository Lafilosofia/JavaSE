package day05;
/**
 *  操作流中的异常捕获及其释放流资源
 */
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("osw.txt");
			byte[] bytes = new byte[100];
			int len = fis.read(bytes);
			System.out.println(new String(bytes,0,len,"UTF-8"));
		}catch(Exception e){
			System.out.println("读取文件异常...");
			e.printStackTrace();//日志跟踪
		}finally{
			try {
				if(fis != null){
					System.out.println("关闭流,释放资源");
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
