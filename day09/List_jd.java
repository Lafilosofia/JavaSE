package day09;

import java.util.ArrayList;
import java.util.List;

/**
 * List��������List����
 * @author HP
 *
 */
public class List_jd {
	public static void main(String[] args) {
		//�����Ƽ�
		List<String> list1 = new ArrayList<String>();
		list1.add("iPhone");
		list1.add("��ҫ");
		list1.add("С��");
		
		//���ŷ���
		List<String> list2 = new ArrayList<String>();
		list2.add("5G�ֻ�");
		list2.add("��Ϸ�ֻ�");
		list2.add("�����ֻ�");
		
		//��Ӫ��
		List<String> list3 = new ArrayList<String>();
		list3.add("Ӫҵ��");
		list3.add("�ֻ���");
		list3.add("���");
		
		//�ֻ�����
		List<List<String>> itemize = new ArrayList<List<String>>();
		itemize.add(list1);
		itemize.add(list2);
		itemize.add(list3);
		//System.out.println(itemize.size());
		//System.out.println(itemize);
		
		//�����ֻ������е�ÿһ�������е�ÿһ��Ԫ��
		for(List<String> li:itemize){
			//System.out.println(li);
			for(String l:li){
				System.out.println(l);
			}
		}
		
		
	}
}
