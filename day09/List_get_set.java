package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List���Ա�
 * List���ص㣺���ظ��������򣬿���ͨ���±����Ԫ��
 * ����ʵ���ࣺ
 * ArrayList:�ڲ�������ʵ�֣���ѯ�죬��ɾ��
 * LinkedList:�ڲ�������ʵ�֣���ѯ������ɾ��
 * 
 * �����в��Ǽ��˿��̵������,ͨ��ʹ��ArrayList
 * @author 86180
 *
 */
public class List_get_set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		String str = list.get(1);
		System.out.println(str);
		
		//��ͳ��forѭ�����Ա���List����
		for(int i = 0;i < list.size();i ++){
			String s = list.get(i);//��ȡ������ÿһ��Ԫ�ص��±귵���±�����Ӧ��Ԫ��
			System.out.println(s);
		}
		
		//��ǿforѭ��(��ѭ��)����List����
		for(String s:list){
			System.out.println(s);
		}
		
		//�õ���������List����
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		//[one,2,three,four]
		/*
		 * E set(int index,E e);
		 * ��ָ��Ԫ��λ�����õ�ָ��λ�ã�����ֵΪԭ��λ�ö�Ӧ��Ԫ�أ��������滻Ԫ�ز���
		 */
		String ss = list.set(1, "2");
		System.out.println(ss);
		System.out.println(list);
		
		/*
		 * E remove(int index);
		 * ɾ�������ظ���λ�ö�Ӧ��Ԫ��
		 */
		String old = list.remove(1);
		System.out.println("��ɾ����Ԫ����:" + old);
	}
}
