package day13;

import java.util.Scanner;

/**
 * ��ֻ����һ�Σ������ε���forName
 * 
 * @author HP
 *
 */
public class ClassForNameReflect02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String className = scanner.nextLine();
		//��̬������
		try{
			Class cls = Class.forName(className);
			Class cls2 = Class.forName(className);
			Class cls3 = Class.forName(className);
			//forName����ֵ��ͬһ�����������
			System.out.println(cls == cls2);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
