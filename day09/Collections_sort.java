package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ���򼯺�
 * ���򼯺Ͽ���ʹ�ü��ϵĹ�����
 * java.util.Collections
 * 
 * �䶨��ܶྲ̬����,���ڲ�������,����sort()�����Ƕ�
 * List���Ͻ�����Ȼ����(����)
 * @author HP
 * 
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		//�Լ���List������������
		Collections.sort(list);
		System.out.println(list);
	}
}
