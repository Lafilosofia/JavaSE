package day13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ����Class���Ͷ���ķ������ܻ�ȡ�������е�����,������
 * -Object		Class cls=obj.getClass();
 * -Class.forName();
 * @author HP
 *
 */
public class ClassForNameReflect03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String className = scanner.nextLine();
		try {
			//��̬������
			Class cls = Class.forName(className);
			//��̬�������е���������
			Field[] field = cls.getDeclaredFields();
			for(Field f : field){
				System.out.println(f);
			}
			//��̬�������е�ָ������
			Field felName = cls.getDeclaredField("name");
			System.out.println("ָ�����е�����:" + felName);
			
			//��̬��ȡ���е����з���
			Method[] method = cls.getDeclaredMethods();
			for(Method m : method){
				System.out.println(m);
			}
			//��̬��ȡ���е�ָ������
			Method meth = cls.getDeclaredMethod("test2", String.class,int.class);
			System.out.println("ָ�����еķ���:"+meth);			
			//���÷���API��������  ��Ҫ
			Object obj = cls.newInstance();
			/*
			 * ���÷���API���Է��ʲ��ɼ���Ա,����˽�����Ի���˽�з���,���������÷���API
			 * ���е���,�ڵ���֮ǰʹ��setAccessible(boolean flag)  Ĭ��Ϊfalse
			 * true��ʾ���Ի�ȡ˽������,false��ʾ�����Ի�ȡ˽������
			 * setAccessible(boolean flag)ִ���Ժ���Դ�ԭ��˽�еķ���Ȩ��,�����Դ��κβ��ɼ�����,�����ķ���Ȩ��
			 */
			felName.setAccessible(true);
			
			/*
			 * ��̬��ȡ�������Ե�ֵ,
			 * ��obj�����ϻ�ȡfelName���Ե�ֵ,���obj������û��felName����,
			 * ���׳��쳣
			 */
			Object obj2 = felName.get(obj);
			System.out.println("name������ֵ��:" + obj2);
			
			/*
			 * ���������û������ڼ������,�����Ǹ���������γ���ͻ�����Ǹ����Ե�ֵ!
			 * Ҳ��ζ��,���������֮���ǵ���ϵĹ�ϵ
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
