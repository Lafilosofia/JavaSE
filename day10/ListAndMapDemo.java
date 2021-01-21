package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListAndMapDemo {
	public static void main(String[] args) {
		Map<String,Double> tv = new HashMap<String,Double>();
		tv.put("平板电视",3500.00);
		tv.put("家庭影音",12000.00);
		
		
		Map<String,Double> washing = new HashMap<String,Double>();
		washing.put("对开门冰箱",8800.00);
		washing.put("立柜式空调",6800.00);
		
		
		Map<String,Double> cosmetics = new HashMap<String,Double>();
		cosmetics.put("兰蔻",3000.00);
		cosmetics.put("欧莱雅",280.00);
		
		List<Map<String,Double>> list1 = new ArrayList<Map<String,Double>>();
		
		
		List<Map<String,Double>> list = new ArrayList<Map<String,Double>>();
		list.add(tv);
		list.add(washing);
		list.add(cosmetics);
		System.out.println(list);
		
		
		//遍历list集合中的所有key和value
		for(Map<String,Double> m:list){
				Set<Entry<String,Double>> entry = m.entrySet();
			for(Entry<String,Double> e:entry){
				String key = e.getKey();
				Double value = e.getValue();
				System.out.println(key + "," + value);
			}
		}
	
	}
}
