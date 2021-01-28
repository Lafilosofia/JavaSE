package day13;

import java.util.Scanner;

/**
 * 类只加载一次，即便多次调用forName
 * 
 * @author HP
 *
 */
public class ClassForNameReflect02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入类名");
		String className = scanner.nextLine();
		//动态加载类
		try{
			Class cls = Class.forName(className);
			Class cls2 = Class.forName(className);
			Class cls3 = Class.forName(className);
			//forName返回值是同一个对象的引用
			System.out.println(cls == cls2);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
