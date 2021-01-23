package day10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����:
 * ���п��Ա���һ��Ԫ��,���Ǵ�ȡԪ�ر�����ѭ:�Ƚ��ȳ�
 * java.util.Queue�ӿڹ涨�˶�����ش�ȡԪ�صȲ���
 * Queue�̳���java.util.Collection,���Լ��ϵ���ط���Ҳ�߱�,
 * ����,clear�ȳ��ù���;
 * ����ʵ����java.util.LinkedList
 * @author HP
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/*
		 * ��Ӳ���:Queue�ṩ����ӷ���offer()
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		//���ö���Ԫ��,�������Ӳ���(���ض���Ԫ��,���ǲ���ɾ��) peek()����
		String str = queue.peek();
		//System.out.println(str);
		//System.out.println(queue);
		
		//���Ӳ���(�Ӷ���ɾ��������һ��Ԫ��) poll()����
		/*String str2 = queue.poll();
		System.out.println(str2);
		System.out.println(queue);*/
		
		//�Ѷ���������Ԫ�س��Ӳ�����ɾ��(��ѭ����)
		//System.out.println(queue.size());
		/*int n = queue.size();
		for(int i = 0;i < n;i ++){
			System.out.println(queue.poll());
		}*/
		while(!queue.isEmpty()){
			queue.poll();
		}
		System.out.println("queue:"+queue);
		
	}
}
