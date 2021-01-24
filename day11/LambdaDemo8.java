package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 在JDK1.7版本以上支持一个方法forEach()
 * list集合，Map集合可以使用Lambda表达式进行遍历
 * @author 86180
 *
 */
public class LambdaDemo8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		//遍历以上list集合有几种方式
		//方式1 for
		for(int i = 0;i < list.size();i ++){
			System.out.println(list.get(i));
		}
		
		//方式2 增强for循环
		for(String s : list){
			System.out.println(s);
		}
		
		//方式3 迭代器 Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()){	//问
			String str = it.next();		//取
			System.out.println(str);
		}
		
		//方式4 Lambda表达式
		list.forEach((s) -> System.out.println(s));
		
		
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("冰箱",8888.00);
		map.put("洗衣机",5000.00);
		map.put("空调",3000.00);
		map.put("电视机",7800.00);
		//Map集合中的key,value;
		Set<Entry<String,Double>> entry = map.entrySet();
		for(Entry<String,Double> e : entry){
			System.out.println(e.getKey() + ":" + e.getKey());
		}
		
		map.forEach((k,v) -> System.out.println(k + ":" + v));
	}
}
