package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * List<E> subList(int fromIndex, int toIndex)
 * ��ȡָ����Χ���Ӽ�
 * @author 86180
 *
 */
public class List_subList {
	public static void main(String[] args) {
		/*
		 * ���뼯���еķ������ͱ����ǲ���������������Ҳ���ǰ�װ����
		 * �����������뼯�ϵ�int���ͱ��������İ�װ����Integer����
		 */
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		//for(int i = 0;i < 10;i ++){
		//	list.add(random.nextInt(100));
		//}
		//System.out.println(list);
		//��ȡ�����е��±���3��Ԫ�ص��±���8Ԫ��
		//List<Integer> subList = list.subList(3, 8);
		//System.out.println("��ȡ��ļ����Ӽ�:" + subList);
		
		for(int i = 0;i < 10;i ++){
			list.add(i);
		}
		System.out.println(list);
		
		//��ȡ3-7Ԫ�ز����Ӽ�Ԫ������10��
		List<Integer> subList02 = list.subList(3, 8);
		for(int i = 0;i < subList02.size();i ++){
			subList02.set(i, subList02.get(i) * 10);
		}
		System.out.println(subList02);
		//���Լ�Ԫ�ز������Ƕ�ԭ���϶�ӦԪ�صĲ���
		System.out.println("ԭ����list����:" + list);
		
		/*
		 * ɾ��listԪ�ص����������߸�
		 */
		list.subList(3, 8).clear();
		System.out.println(list);
	}
}
