package day13;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * getDeclaredMethods和getMethods区别:
 * 
 * getDeclaredMethods:只查询当前类Class中的方法;
 * 
 * getMethods:查询当前类Class中的方法和父类中继承的方法(私有方法不可获取)
 * @author HP
 *
 */
public class ClassForNameReflect04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入类名");
		String className = scanner.next();
		try {
			Class cls = Class.forName(className);
			//获取当前类中的所有方法
			Method[] methods = cls.getDeclaredMethods();
			for(Method m : methods){
				System.out.println(m);
			}
			
			//获取当前类和父类中的所有方法
			Method[] meths = cls.getMethods();
			for(Method m : meths){
				System.out.println("本类和父类中的方法:"+m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
