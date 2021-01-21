package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �̰߳�ȫ�ļ���:
 * ���õļ���ʵ����:ArrayList,LinkedList,HashSet���Ƕ�����
 * �̰߳�ȫ��,���߳������ʹ�û���ֲ�������;
 * Collections�ṩ�˽�����ת��Ϊ�̰߳�ȫ�ķ���
 * @author HP
 *
 */
public class CollectionSynDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//���ü���ת��Ϊ�̰߳�ȫ��
		list = Collections.synchronizedList(list);
		
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
	}
}
