package day13;

import java.util.Scanner;

/**
 * ��̬�����ൽ�ڴ���
 * @author HP
 *
 */
public class ClassForNameReflect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//������������ȫ��(����+����)
		System.out.println("����������");
		String className = scanner.nextLine();
		/*
		 * ��̬�����࣬��Class���ṩforName(String className)
		 * ����һ��Classʵ��
		 * �����������ʱ�򣬻��׳�û���ҵ�����쳣
		 */
		try{
			Class cls = Class.forName(className);
			System.out.println(cls);
			
			//���÷���API��̬��������
			Object obj = cls.newInstance();
			System.out.println(obj);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
