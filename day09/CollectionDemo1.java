package day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK1.5之后推出的一个特性:泛型
 * 泛型也称为参数化类型,他可以用于指定一个类中的属性类型,方法参数的类型
 * 以及返回值类型等,这样做的好处就是将类型的定义权交给了调用者,而不再是提供者决定,提高了灵活度
 * 泛型在集合中广泛被使用,用于指定集合中的元素类型,若不指定泛型,则默认为原型Object
 * @author HP
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		/*
		 * 当调用方法传入泛型约束的参数时,编译器会检查实际参数是否符合该参数指定的泛型类型,
		 * 不符合则编译不通过,由于当前集合泛型指定为String类型,那么调用add方法时编译器会检查
		 * 实际参数是否为String类型
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		//System.out.println(c);
		
		/*
		 * 使用新循环遍历时,接受每个集合元素时也可以直接使用泛型类型的实际类型
		 */
		for(String s:c){
			System.out.println(s);
		}
		
		//用迭代器遍历并删除 "four"元素
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			if("four".equals(str)){
				it.remove();
			}
			System.out.println("遍历出来的每个元素:" + str);
		}
		System.out.println(c);
	}
}
