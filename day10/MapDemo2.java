package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���:
 * Map�����ֱ�����ʽ:
 * 1.�������е�key
 * 2.�������е�key-value��ֵ��
 * 3.�������е�value(��Բ�����)
 * 
 * @author HP
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����", 80);
		map.put("��ѧ", 99);
		map.put("Ӣ��", 61);
		map.put("��ѧ", 90);
		System.out.println(map);
		
		//��������Ĵ��뼯��
		Map<String,Integer> linked = new LinkedHashMap<String,Integer>();
		linked.put("����", 80);
		linked.put("��ѧ", 99);
		linked.put("Ӣ��", 61);
		linked.put("��ѧ", 90);
		System.out.println(linked);
		
		/*
		 * List:����,���ظ�
		 * Set:����,�����ظ�
		 * 1.�������е�key:
		 * Map�ṩ��һ������:
		 * Set keySet()
		 * ����ǰMap�����е�key����һ�����Ϻ󷵻�,�������set���ϵ��ڱ��������е�key
		 */
		Set<String> keyset = map.keySet();
		for(String key:keyset){
			System.out.println(key);
		}
		
		/*
		 * 3.�������е�value(��Բ�����)
		 * Collection values()
		 * ����ǰ��Map�����е�value��һ�����ϵ���ʽ����
		 */
		Collection<Integer> values = map.values();
		for(Integer v:values){
			System.out.println(v);
		}
		
		//�󼯺��еĿ�Ŀƽ��ֵ
		double sum = 0.0;
		for(Integer v:values){
			sum += v;
		}
		System.out.println(sum / map.size());
		
		/*
		 * 2.�������е�key-value��ֵ��
		 * ����ÿһ���ֵ��,��Map�ӿ��ж�����һ���ڲ��ӿ�java.util.Map.Entry
		 * Entry��ÿ��ʵ�����ڱ�ʾ��ǰMap�е�һ���ֵ��,�ṩ���������÷���;
		 * K getKey():��ȡkey��ֵ
		 * V getValue():��ȡvalue��ֵ
		 * 
		 * ��ͬ��Mapʵ���඼ʵ����Entry,����ʵ�����ÿ��ʵ����ʾһ������ļ�ֵ��
		 * 
		 * Set<Entry> entrySet()�÷����ὫMap�����м�ֵ�Դ���һ�����Ϸ���
		 * 
		 */
		Set<Entry<String,Integer>> entry = map.entrySet();
		for(Entry<String,Integer> e:entry){
			String key = e.getKey();//��Entry�л�ȡMap�е�ÿһ��key
			Integer value = e.getValue();//��Entry�л�ȡMap�е�ÿһ��value
			System.out.println(key + "," + value);
		}
		
		
	}
}
