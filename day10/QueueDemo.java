package day10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列:
 * 队列可以保存一组元素,但是存取元素必须遵循:先进先出
 * java.util.Queue接口规定了队列相关存取元素等操作
 * Queue继承自java.util.Collection,所以集合的相关方法也具备,
 * 比如,clear等常用功能;
 * 常用实现类java.util.LinkedList
 * @author HP
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/*
		 * 入队操作:Queue提供了入队方法offer()
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		//引用队首元素,不做出队操作(返回队首元素,但是并不删除) peek()方法
		String str = queue.peek();
		//System.out.println(str);
		//System.out.println(queue);
		
		//出队操作(从队首删除并返回一个元素) poll()方法
		/*String str2 = queue.poll();
		System.out.println(str2);
		System.out.println(queue);*/
		
		//把队列中所有元素出队操作并删除(用循环做)
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
