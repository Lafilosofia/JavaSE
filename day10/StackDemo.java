package day10;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈:
 * 可以存储一组元素,但是存取元素必须遵循:先进后出原则;
 * 栈可以通过双端队列Deque实现
 * 
 * 通常栈用于"后退"这样的操作
 * @author HP
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		//入栈操作(队首入栈)  方法push()
		/*stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);*/
		
		//出栈操作 引用栈首元素,不做出栈操作(返回栈首元素,但是并不删除) peek()方法
		/*String s = stack.peek();
		System.out.println(s);
		System.out.println(stack);*/
		
		//出栈操作(从栈首删除并返回) pop()
		/*String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);*/
		
		/*
		 * poll和pop两者在实现所用数据结构不同
		 * poll是基于队列结构实现的方法,当队列中没有元素时,调用该方法返回null
		 * pop是基于栈结构实现的方法,当栈中没有元素时,调用该方法会发生异常
		 * pop和poll都是取出LinkedList的第一个元素,并将该元素删除,等效于:removeFirst
		 */
		//String str2=stack.pop();//抛出异常
		String str2 = stack.poll();//返回null
		System.out.println(str2);
	}
}
