package day09;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合套用List集合
 * @author HP
 *
 */
public class List_jd {
	public static void main(String[] args) {
		//热门推荐
		List<String> list1 = new ArrayList<String>();
		list1.add("iPhone");
		list1.add("荣耀");
		list1.add("小米");
		
		//热门分类
		List<String> list2 = new ArrayList<String>();
		list2.add("5G手机");
		list2.add("游戏手机");
		list2.add("拍照手机");
		
		//运营商
		List<String> list3 = new ArrayList<String>();
		list3.add("营业厅");
		list3.add("手机卡");
		list3.add("宽带");
		
		//手机分类
		List<List<String>> itemize = new ArrayList<List<String>>();
		itemize.add(list1);
		itemize.add(list2);
		itemize.add(list3);
		//System.out.println(itemize.size());
		//System.out.println(itemize);
		
		//遍历手机分类中的每一个集合中的每一个元素
		for(List<String> li:itemize){
			//System.out.println(li);
			for(String l:li){
				System.out.println(l);
			}
		}
		
		
	}
}
