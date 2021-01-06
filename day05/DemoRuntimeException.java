package day05;

import java.util.Scanner;
/**
 * 抛出异常并获取异常信息,通常用这样的方式把异常信息传达给客户端
 * @author HP
 *
 */
public class DemoRuntimeException {
	
	public static void register(){
		String name = "admin";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String inputName = scanner.next();
		if(name.equals(inputName)){
			throw new RuntimeException("用户名被占用!");
		}else{
			System.out.println("请继续往下填写");
		}
	}
	
	public static void main(String[] args) {
		try{
			register();
		}catch(Exception e){
			String excMessage = e.getMessage();//捕获异常信息
			System.out.println(excMessage);
		}
	}
}

