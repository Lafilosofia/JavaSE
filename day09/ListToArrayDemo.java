package day09;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ת��Ϊ����
 * Collection�ṩ��һ������:toArray,���Խ���ǰ
 * ����ת��Ϊ����
 * @author HP
 *
 */
public class ListToArrayDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//�Ѽ���ת��Ϊ����
		String[] s = new String[list.size()];
		String[] str = list.toArray(s);
		System.out.println(str.length);
		for(String st : str){
			System.out.println(st);
		}
	}
}
