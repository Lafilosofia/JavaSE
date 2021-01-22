package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历:
 * Map有三种遍历方式:
 * 1.遍历所有的key
 * 2.遍历所有的key-value键值对
 * 3.遍历所有的value(相对不常用)
 * 
 * @author HP
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文", 80);
		map.put("数学", 99);
		map.put("英语", 61);
		map.put("化学", 90);
		System.out.println(map);
		
		//可以有序的存入集合
		Map<String,Integer> linked = new LinkedHashMap<String,Integer>();
		linked.put("语文", 80);
		linked.put("数学", 99);
		linked.put("英语", 61);
		linked.put("化学", 90);
		System.out.println(linked);
		
		/*
		 * List:有序,可重复
		 * Set:无序,不能重复
		 * 1.遍历所有的key:
		 * Map提供了一个方法:
		 * Set keySet()
		 * 将当前Map中所有的key存入一个集合后返回,遍历这个set集合等于遍历了所有的key
		 */
		Set<String> keyset = map.keySet();
		for(String key:keyset){
			System.out.println(key);
		}
		
		/*
		 * 3.遍历所有的value(相对不常用)
		 * Collection values()
		 * 将当前的Map中所有的value以一个集合的形式返回
		 */
		Collection<Integer> values = map.values();
		for(Integer v:values){
			System.out.println(v);
		}
		
		//求集合中的科目平均值
		double sum = 0.0;
		for(Integer v:values){
			sum += v;
		}
		System.out.println(sum / map.size());
		
		/*
		 * 2.遍历所有的key-value键值对
		 * 遍历每一组键值对,在Map接口中定义了一个内部接口java.util.Map.Entry
		 * Entry的每个实例用于表示当前Map中的一组键值对,提供了两个常用方法;
		 * K getKey():获取key的值
		 * V getValue():获取value的值
		 * 
		 * 不同的Map实现类都实现了Entry,并用实现类的每个实例表示一个具体的键值对
		 * 
		 * Set<Entry> entrySet()该方法会将Map中所有键值对存入一个集合返回
		 * 
		 */
		Set<Entry<String,Integer>> entry = map.entrySet();
		for(Entry<String,Integer> e:entry){
			String key = e.getKey();//从Entry中获取Map中的每一个key
			Integer value = e.getValue();//从Entry中获取Map中的每一个value
			System.out.println(key + "," + value);
		}
		
		
	}
}
