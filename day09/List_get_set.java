package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List线性表
 * List的特点：可重复并且有序，可以通过下标操作元素
 * 常用实现类：
 * ArrayList:内部有数组实现，查询快，增删慢
 * LinkedList:内部有链表实现，查询满，增删快
 * 
 * 对于行不是极端苛刻的情况下,通常使用ArrayList
 * @author 86180
 *
 */
public class List_get_set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		String str = list.get(1);
		System.out.println(str);
		
		//传统的for循环可以遍历List集合
		for(int i = 0;i < list.size();i ++){
			String s = list.get(i);//获取集合中每一个元素的下标返回下标所对应的元素
			System.out.println(s);
		}
		
		//增强for循环(新循环)遍历List集合
		for(String s:list){
			System.out.println(s);
		}
		
		//用迭代器遍历List集合
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		//[one,2,three,four]
		/*
		 * E set(int index,E e);
		 * 将指定元素位置设置到指定位置，返回值为原来位置对应的元素，所以是替换元素操作
		 */
		String ss = list.set(1, "2");
		System.out.println(ss);
		System.out.println(list);
		
		/*
		 * E remove(int index);
		 * 删除并返回给定位置对应的元素
		 */
		String old = list.remove(1);
		System.out.println("被删掉的元素是:" + old);
	}
}
