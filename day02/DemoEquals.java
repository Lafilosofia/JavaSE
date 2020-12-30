package day02;

import java.awt.Point;

/**
 * equals(Object obj)演示:
 * 重点知识:
 * equals和==区别:
 * 1.==在基本类型中用于比较变量的值,如果用于引用类型,比较的是两个引用变量是否指向同一个对象
 * 2.equals()重写Object中的equals()方法,重写以后可以用于比较两个对象的内容是否一样
 * @author HP
 *
 */
public class DemoEquals {
	public static void main(String[] args) {
		Point p=new Point(5,6);
		Point p2=new Point(5,6);
		System.out.println(p.equals(p2));
		/*String str=new String("ABC");
		String str02="ABC";
		System.out.println(str.equals(str02));*/
	}
}
