package day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK1.5֮���Ƴ���һ������:����
 * ����Ҳ��Ϊ����������,����������ָ��һ�����е���������,��������������
 * �Լ�����ֵ���͵�,�������ĺô����ǽ����͵Ķ���Ȩ�����˵�����,���������ṩ�߾���,���������
 * �����ڼ����й㷺��ʹ��,����ָ�������е�Ԫ������,����ָ������,��Ĭ��Ϊԭ��Object
 * @author HP
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		/*
		 * �����÷������뷺��Լ���Ĳ���ʱ,����������ʵ�ʲ����Ƿ���ϸò���ָ���ķ�������,
		 * ����������벻ͨ��,���ڵ�ǰ���Ϸ���ָ��ΪString����,��ô����add����ʱ����������
		 * ʵ�ʲ����Ƿ�ΪString����
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		//System.out.println(c);
		
		/*
		 * ʹ����ѭ������ʱ,����ÿ������Ԫ��ʱҲ����ֱ��ʹ�÷������͵�ʵ������
		 */
		for(String s:c){
			System.out.println(s);
		}
		
		//�õ�����������ɾ�� "four"Ԫ��
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			if("four".equals(str)){
				it.remove();
			}
			System.out.println("����������ÿ��Ԫ��:" + str);
		}
		System.out.println(c);
	}
}
