package day13;
/**
 * ����:
 * 1.Java�ṩ��һ��API
 * 2.�ṩ�˼��һ�������ڲ����ֶ�
 * 3.����API����
 * 		��̬������,
 * 		��̬��������,
 * 		��̬��������,
 * 		��̬���÷���
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoReflect {
	public static void main(String[] args) {
		test("ABC");
		//test('A');
		//test(1);
		/*List<String> list=new ArrayList<String>();
		Iterator<String> it=list.iterator();
		Class cls=it.getClass();
		System.out.println(cls);*/
	}
	
	public static void test(Object obj){
		//ͨ��������Լ�����͵��ڲ��ṹ,��̬��ȡobj������
		//Object���ṩ��getClass()����һ��Class��
		Class cls = obj.getClass();
		System.out.println(cls);
		/*
		 * ���������������������Щ����
		 * Declared:������(����)
		 * Field:�ֶ�,����
		 */
		//��ȡ�����е���������
		Field[] field = cls.getDeclaredFields();
		for(Field f : field){
			//System.out.println(f);
		}
		
		/*
		 * ��ȡ�����е�ָ������
		 * Class���ṩ��getDeclaredField(String name)
		 * name:�����е�����
		 */
		try {
			Field fel = cls.getDeclaredField("hash");
			//System.out.println(fel); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * ��ȡ�����е����з���
		 * Method��������reflect��,����Class�������ķ�����Ϣ
		 */
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m);
		}
		
		/*
		 * ��ȡ������ָ���ķ���
		 * getDeclaredMethod(String name,parameterTypes types);
		 * name:��������;
		 * types:�����еĲ�������,���������","����
		 */
		try {
			//Method mt=cls.getDeclaredMethod("hashCode");//û�в���
			Method mt = cls.getDeclaredMethod("compareTo", String.class);//һ������
			//Method mt=cls.getDeclaredMethod("indexOf",int.class,int.class);//��������
			System.out.println("ָ���ķ�����:"+mt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * ��ȡ�����е����й��췽��
		 * Constructor
		 */
		Constructor[] con = cls.getDeclaredConstructors();
		for(Constructor c : con){
			System.out.println("�����еĹ��췽��:"+c);
		}
		
		//��ȡ�����е�ָ�����췽��
		try {
			Constructor co = cls.getDeclaredConstructor(byte[].class,String.class);
			System.out.println("������ָ���Ĺ��췽��"+co);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
