package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day09.Point2;

/**
 * Set集合:不可重复,无序
 * 实现Set集合的类是HashSet
 * java.util.Set不可重复,无序,元素是否重复依靠元素自身equals比较的结果而定
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
		/*System.out.println("集合长度:"+set.size());
		System.out.println(set);*/
		
		//Set集合不能重复是通过equals作比较
		Set<Point2> set2 = new HashSet<Point2>();
		set2.add(new Point2(2,3));
		set2.add(new Point2(2,4));
		set2.add(new Point2(2,5));
		set2.add(new Point2(3,7));
		set2.add(new Point2(2,5));
		System.out.println(set2.size());
		System.out.println(set2);
		
		List<Point2> list = new ArrayList<Point2>();
		//List集合可重复,有序
		list.add(new Point2(2,3));
		list.add(new Point2(2,4));
		list.add(new Point2(2,5));
		list.add(new Point2(3,7));
		list.add(new Point2(2,5));
		System.out.println(list.size());
		System.out.println(list);
	}
}
