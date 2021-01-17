package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_sort3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("�ĵ�����");
		list.add("��ޱ");
		list.add("������");
		System.out.println(list);
		/*
		 * �Ƽ�������ʽ:
		 * �����������Զ�������Ԫ��,���߼���Ԫ������ıȽϹ�����������ʱ������ʹ��
		 * ����ķ�ʽ����
		 * ��sort����Ҫ����⴫��һ���Ƚ���(Comparator)����Ƚϼ���Ԫ�ز���������,���
		 * ���򷽷���Ҫ�󼯺�Ԫ��ʵ��Comparable�ӿ�
		 */
		Collections.sort(list,new Comparator<String>() {
			//�Զ�����������ַ����ĳ�������
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println("�Զ��������Ľ��:" + list);
		
	}
}
