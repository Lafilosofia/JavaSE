package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day09.Point2;

/**
 * Set����:�����ظ�,����
 * ʵ��Set���ϵ�����HashSet
 * java.util.Set�����ظ�,����,Ԫ���Ƿ��ظ�����Ԫ������equals�ȽϵĽ������
 * @author Lenovo
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("6");
		set.add("7");
		set.add("8");
		set.add("9");
		set.add("10");
		set.add("9");
		/*System.out.println("���ϳ���:"+set.size());
		System.out.println(set);*/
		
		//Set���ϲ����ظ���ͨ��equals���Ƚ�
		Set<Point2> set2 = new HashSet<Point2>();
		set2.add(new Point2(2,3));
		set2.add(new Point2(2,4));
		set2.add(new Point2(2,5));
		set2.add(new Point2(3,7));
		set2.add(new Point2(2,5));
		System.out.println(set2.size());
		System.out.println(set2);
		
		List<Point2> list = new ArrayList<Point2>();
		//List���Ͽ��ظ�,����
		list.add(new Point2(2,3));
		list.add(new Point2(2,4));
		list.add(new Point2(2,5));
		list.add(new Point2(3,7));
		list.add(new Point2(2,5));
		System.out.println(list.size());
		System.out.println(list);
	}
}
