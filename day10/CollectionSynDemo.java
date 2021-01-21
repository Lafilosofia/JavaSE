package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 线程安全的集合:
 * 常用的集合实现类:ArrayList,LinkedList,HashSet它们都不是
 * 线程安全的,多线程情况下使用会出现并发问题;
 * Collections提供了将集合转换为线程安全的方法
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
		//将该集合转换为线程安全的
		list = Collections.synchronizedList(list);
		
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
	}
}
