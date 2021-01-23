package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("小泽");
		list.add("啰嗦夫斯基");
		list.add("苍老师");
		list.add("小泽玛丽");
		System.out.println(list);
		
		//自定义比较器
		/*Comparator<String> c=new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
			
		};
		
		Collections.sort(list,c);
		System.out.println("比较后的结果:"+list);*/
		
		//Lambda表达式
		//方式一:
		Comparator<String> c = (o1, o2)->{
			return o1.length() - o2.length();
		};
		Collections.sort(list, c);
		System.out.println(list);
		
		//方式二:
		Comparator<String> c1 = (o1,o2)->o1.length() - o2.length();
		Collections.sort(list, c1);
		System.out.println(list);
		
		
	}
}
