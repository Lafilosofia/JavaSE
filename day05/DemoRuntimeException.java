package day05;

import java.util.Scanner;
/**
 * �׳��쳣����ȡ�쳣��Ϣ,ͨ���������ķ�ʽ���쳣��Ϣ������ͻ���
 * @author HP
 *
 */
public class DemoRuntimeException {
	
	public static void register(){
		String name = "admin";
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String inputName = scanner.next();
		if(name.equals(inputName)){
			throw new RuntimeException("�û�����ռ��!");
		}else{
			System.out.println("�����������д");
		}
	}
	
	public static void main(String[] args) {
		try{
			register();
		}catch(Exception e){
			String excMessage = e.getMessage();//�����쳣��Ϣ
			System.out.println(excMessage);
		}
	}
}

