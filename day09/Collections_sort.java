package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序集合
 * 排序集合可以使用集合的工具类
 * java.util.Collections
 * 
 * 其定义很多静态方法,用于操作集合,其中sort()方法是对
 * List集合进行自然排序(升序)
 * @author HP
 * 
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		//对集合List进行升序排序
		Collections.sort(list);
		System.out.println(list);
	}
}
