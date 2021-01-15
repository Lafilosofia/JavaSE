package day08;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环(增强for循环)遍历集合
 * @author 86180
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("four");
		c.add(9.01);
		
		for(Object str:c){
			if("#".equals(str)){
				c.remove(str);
			}
		}
	}
}
