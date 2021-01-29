package day13;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射API动态执行对象的方法及其返回值
 * @author HP
 *
 */
public class InvokeMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入类名");
		String className = scanner.next();
		System.out.println("请输入方法名");
		String methodName = scanner.next();
		try {
			//动态加载类
			Class cls = Class.forName(className);
			//在类cls中找到需要执行的methodName,如果名字错误,则抛出找不到的异常
			Method method = cls.getDeclaredMethod("test2", String.class,int.class);
			System.out.println(method);
			
			//通过反射创建对象实例化
			Object obj = cls.newInstance();
			//setAccessible(boolean flag)执行以后可以打开原有私有的访问权限,还可以打开任何不可见属性,方法的访问权限
			method.setAccessible(true);
			//Method方法必须在obj类中,否则会抛出异常
			Object obj2 = method.invoke(obj, "测试",9);
			/*
			 * obj2输出经过反射得到的方法返回值,如果此方法没有返回值则返回null,
			 * 如果有返回值则返回对应的返回值
			 */
			System.out.println(obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
