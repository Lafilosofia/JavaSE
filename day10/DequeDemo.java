package day10;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ˫�˶���
 * java.util.Deque�ӿ�,���̳���java.util.Queue
 * 
 * ˫�˶��е��ص�:���˶����Խ�����
 * @author HP
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		/*
		 * ��Ӳ��� offer()
		 */
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		
		//�Ӷ��׷������
		deque.offerFirst("zero");
		System.out.println(deque);
		
		//�Ӷ�β�������
		deque.offerLast("four");
		System.out.println(deque);
		
		//���Ӳ���(����)��ɾ��
		String str = deque.pollFirst();
		System.out.println(str);
		
		//���Ӳ���(��β)��ɾ��
		String str2 = deque.pollLast();
		System.out.println(str2);
		
		System.out.println(deque);
		
	}
}
