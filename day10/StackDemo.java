package day10;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ:
 * ���Դ洢һ��Ԫ��,���Ǵ�ȡԪ�ر�����ѭ:�Ƚ����ԭ��;
 * ջ����ͨ��˫�˶���Dequeʵ��
 * 
 * ͨ��ջ����"����"�����Ĳ���
 * @author HP
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		//��ջ����(������ջ)  ����push()
		/*stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);*/
		
		//��ջ���� ����ջ��Ԫ��,������ջ����(����ջ��Ԫ��,���ǲ���ɾ��) peek()����
		/*String s = stack.peek();
		System.out.println(s);
		System.out.println(stack);*/
		
		//��ջ����(��ջ��ɾ��������) pop()
		/*String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);*/
		
		/*
		 * poll��pop������ʵ���������ݽṹ��ͬ
		 * poll�ǻ��ڶ��нṹʵ�ֵķ���,��������û��Ԫ��ʱ,���ø÷�������null
		 * pop�ǻ���ջ�ṹʵ�ֵķ���,��ջ��û��Ԫ��ʱ,���ø÷����ᷢ���쳣
		 * pop��poll����ȡ��LinkedList�ĵ�һ��Ԫ��,������Ԫ��ɾ��,��Ч��:removeFirst
		 */
		//String str2=stack.pop();//�׳��쳣
		String str2 = stack.poll();//����null
		System.out.println(str2);
	}
}
