package day13;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ���÷���API��ִ̬�ж���ķ������䷵��ֵ
 * @author HP
 *
 */
public class InvokeMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String className = scanner.next();
		System.out.println("�����뷽����");
		String methodName = scanner.next();
		try {
			//��̬������
			Class cls = Class.forName(className);
			//����cls���ҵ���Ҫִ�е�methodName,������ִ���,���׳��Ҳ������쳣
			Method method = cls.getDeclaredMethod("test2", String.class,int.class);
			System.out.println(method);
			
			//ͨ�����䴴������ʵ����
			Object obj = cls.newInstance();
			//setAccessible(boolean flag)ִ���Ժ���Դ�ԭ��˽�еķ���Ȩ��,�����Դ��κβ��ɼ�����,�����ķ���Ȩ��
			method.setAccessible(true);
			//Method����������obj����,������׳��쳣
			Object obj2 = method.invoke(obj, "����",9);
			/*
			 * obj2�����������õ��ķ�������ֵ,����˷���û�з���ֵ�򷵻�null,
			 * ����з���ֵ�򷵻ض�Ӧ�ķ���ֵ
			 */
			System.out.println(obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
