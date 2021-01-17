package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_sort3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("文刀土申");
		list.add("闫薇");
		list.add("王云龙");
		System.out.println(list);
		/*
		 * 推荐的排序方式:
		 * 当遇到排序自定义类型元素,或者集合元素自身的比较规则不满足排序时都建议使用
		 * 下面的方式排列
		 * 该sort方法要求额外传入一个比较器(Comparator)规则比较集合元素并进行排序,因此
		 * 排序方法不要求集合元素实现Comparable接口
		 */
		Collections.sort(list,new Comparator<String>() {
			//自定义排序根据字符串的长度排序
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println("自定义排序后的结果:" + list);
		
	}
}
