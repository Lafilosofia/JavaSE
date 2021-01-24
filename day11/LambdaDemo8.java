package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ��JDK1.7�汾����֧��һ������forEach()
 * list���ϣ�Map���Ͽ���ʹ��Lambda���ʽ���б���
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
		//��������list�����м��ַ�ʽ
		//��ʽ1 for
		for(int i = 0;i < list.size();i ++){
			System.out.println(list.get(i));
		}
		
		//��ʽ2 ��ǿforѭ��
		for(String s : list){
			System.out.println(s);
		}
		
		//��ʽ3 ������ Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()){	//��
			String str = it.next();		//ȡ
			System.out.println(str);
		}
		
		//��ʽ4 Lambda���ʽ
		list.forEach((s) -> System.out.println(s));
		
		
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("����",8888.00);
		map.put("ϴ�»�",5000.00);
		map.put("�յ�",3000.00);
		map.put("���ӻ�",7800.00);
		//Map�����е�key,value;
		Set<Entry<String,Double>> entry = map.entrySet();
		for(Entry<String,Double> e : entry){
			System.out.println(e.getKey() + ":" + e.getKey());
		}
		
		map.forEach((k,v) -> System.out.println(k + ":" + v));
	}
}
