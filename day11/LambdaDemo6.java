package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("С��");
		list.add("���·�˹��");
		list.add("����ʦ");
		list.add("С������");
		System.out.println(list);
		
		//�Զ���Ƚ���
		/*Comparator<String> c=new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
			
		};
		
		Collections.sort(list,c);
		System.out.println("�ȽϺ�Ľ��:"+list);*/
		
		//Lambda���ʽ
		//��ʽһ:
		Comparator<String> c = (o1, o2)->{
			return o1.length() - o2.length();
		};
		Collections.sort(list, c);
		System.out.println(list);
		
		//��ʽ��:
		Comparator<String> c1 = (o1,o2)->o1.length() - o2.length();
		Collections.sort(list, c1);
		System.out.println(list);
		
		
	}
}
