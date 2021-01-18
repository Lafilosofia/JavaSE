package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * List<E> subList(int fromIndex, int toIndex)
 * 截取指定范围的子集
 * @author 86180
 *
 */
public class List_subList {
	public static void main(String[] args) {
		/*
		 * 参与集合中的泛型类型必须是参与面向对象的类型也就是包装类型
		 * 因此在这里参与集合的int类型必须是它的包装类型Integer类型
		 */
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		//for(int i = 0;i < 10;i ++){
		//	list.add(random.nextInt(100));
		//}
		//System.out.println(list);
		//截取集合中的下标是3的元素到下标是8元素
		//List<Integer> subList = list.subList(3, 8);
		//System.out.println("截取后的集合子集:" + subList);
		
		for(int i = 0;i < 10;i ++){
			list.add(i);
		}
		System.out.println(list);
		
		//截取3-7元素并将子集元素扩大10倍
		List<Integer> subList02 = list.subList(3, 8);
		for(int i = 0;i < subList02.size();i ++){
			subList02.set(i, subList02.get(i) * 10);
		}
		System.out.println(subList02);
		//对自己元素操作就是对原集合对应元素的操作
		System.out.println("原来的list集合:" + list);
		
		/*
		 * 删除list元素第三个到第七个
		 */
		list.subList(3, 8).clear();
		System.out.println(list);
	}
}
