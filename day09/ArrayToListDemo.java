package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 通过集合的工具类arrays的静态方法alList可以将数组转换为List集合
 * @author 86180
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = new String[]{"one","two","three","four"};
		//数组转换为集合
		List<String> list = Arrays.asList(array);
		
		list.set(0, "1");
		System.out.println(list);
		//对集合元素的操作就是对原数组元素的操作
		System.out.println("原数组:" + Arrays.toString(array));
		/*
		 * 由于添加元素会导致数组扩容，那就不能表示原数组
		 */
		//list.add("five");  抛异常
		//list.remove("1");
		
		//集合复制
		List<String> list2=new ArrayList<String>(list);
		list2.add("five");
		System.out.println("list2集合:"+list2);
	}

}
