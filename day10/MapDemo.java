package day10;

import java.util.HashMap;
import java.util.Map;

/**
 * 给map集合添加元素
 * @author 86180
 * Map称为查找表，该数据结构体现了样子是一个"多行两列"的表格，
 * 左列称为key，右列称为value。
 * Map总是根据key查找对应的value
 * 存储元素也要求以key-value成对存入
 * 
 * 常用的实现类:java.util.HashMap散列表，哈希表HashMap时基于散列算法实现的Map
 * 当今世界最快的查询结构
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(Key key,Value v)
		 * 将给定的key-value键值对存入到Mao中，Map有一个要求
		 * key不允许重复(key的equals比较决定)；若使用Mao已有的key存入value，
		 * 则是替换value
		 */
		Integer sorce2 = map.put("语文", 99);
		System.out.println(sorce2);
		
		map.put("语文", 80);
		map.put("数学", 99);
		map.put("英语", 60);
		map.put("化学", 90);
		System.out.println(map);
		
		//map集合的长度 size()
		int size = map.size();
		//System.out.println(size);
		
		/*
		 * V get(Key key)
		 * 根据给定的key获取对应的value,若给定的key不存在,则返回为null;
		 */
		//查看数学的成绩
		Integer n = map.get("数学和");
		//System.out.println(n);
		
		/*Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("请输入你要查询的科目:");
			String str=scanner.next();
			Integer m=map.get(str);
			if(m==null){
				System.out.println("没有此科目,请重新填写科目!");
				continue;
			}
			System.out.println(str+":"+m+"分");
		}*/
		
		/*
		 * V remove(Key key)
		 * 删除当前Map中给定的key所对应的这组键值对,返回值为该key所
		 * 对应的value,若给定的那个key在Map中不存在,则返回null;
		 */
		Integer mm = map.remove("英语");
		System.out.println("被删掉的value:"+mm);
		System.out.println(map.size()+","+map);
		
		/*
		 * 判断当前Map是否包含给定的key或value
		 */
		boolean bk = map.containsKey("语文");
		System.out.println(bk);
		
		boolean bv = map.containsValue(99);
		System.out.println(bv);
		
		//清空集合
		map.clear();
		System.out.println(map.size()+","+map);
		
		//判断集合是否为空
		System.out.println(map.isEmpty());
	}
}
