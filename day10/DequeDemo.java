package day10;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口,它继承自java.util.Queue
 * 
 * 双端队列的特点:两端都可以进出队
 * @author HP
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		/*
		 * 入队操作 offer()
		 */
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		
		//从队首方向入队
		deque.offerFirst("zero");
		System.out.println(deque);
		
		//从队尾方向入队
		deque.offerLast("four");
		System.out.println(deque);
		
		//出队操作(队首)并删除
		String str = deque.pollFirst();
		System.out.println(str);
		
		//出队操作(队尾)并删除
		String str2 = deque.pollLast();
		System.out.println(str2);
		
		System.out.println(deque);
		
	}
}
