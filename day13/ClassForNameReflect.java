package day13;

import java.util.Scanner;

/**
 * 动态加载类到内存中
 * @author HP
 *
 */
public class ClassForNameReflect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//在这里类名是全名(包名+类名)
		System.out.println("请输入类名");
		String className = scanner.nextLine();
		/*
		 * 动态加载类，用Class类提供forName(String className)
		 * 返回一个Class实例
		 * 当类名错误的时候，会抛出没有找到类的异常
		 */
		try{
			Class cls = Class.forName(className);
			System.out.println(cls);
			
			//利用反射API动态创建对象
			Object obj = cls.newInstance();
			System.out.println(obj);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
