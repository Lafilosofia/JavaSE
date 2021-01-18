package day09;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合转换为数组
 * Collection提供了一个方法:toArray,可以将当前
 * 集合转换为数组
 * @author HP
 *
 */
public class ListToArrayDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//把集合转换为数组
		String[] s = new String[list.size()];
		String[] str = list.toArray(s);
		System.out.println(str.length);
		for(String st : str){
			System.out.println(st);
		}
	}
}
