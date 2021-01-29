package day13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用Class类型对象的方法才能获取到对象中的属性,方法等
 * -Object		Class cls=obj.getClass();
 * -Class.forName();
 * @author HP
 *
 */
public class ClassForNameReflect03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入类名");
		String className = scanner.nextLine();
		try {
			//动态加载类
			Class cls = Class.forName(className);
			//动态查找类中的所有属性
			Field[] field = cls.getDeclaredFields();
			for(Field f : field){
				System.out.println(f);
			}
			//动态查找类中的指定属性
			Field felName = cls.getDeclaredField("name");
			System.out.println("指定类中的属性:" + felName);
			
			//动态获取类中的所有方法
			Method[] method = cls.getDeclaredMethods();
			for(Method m : method){
				System.out.println(m);
			}
			//动态获取类中的指定方法
			Method meth = cls.getDeclaredMethod("test2", String.class,int.class);
			System.out.println("指定类中的方法:"+meth);			
			//利用反射API创建对象  重要
			Object obj = cls.newInstance();
			/*
			 * 利用反射API可以访问不可见成员,无论私有属性还是私有方法,都可以利用反射API
			 * 进行调用,在调用之前使用setAccessible(boolean flag)  默认为false
			 * true表示可以获取私有属性,false表示不可以获取私有属性
			 * setAccessible(boolean flag)执行以后可以打开原有私有的访问权限,还可以打开任何不可见属性,方法的访问权限
			 */
			felName.setAccessible(true);
			
			/*
			 * 动态获取对象属性的值,
			 * 在obj对象上获取felName属性的值,如果obj对象上没有felName属性,
			 * 则抛出异常
			 */
			Object obj2 = felName.get(obj);
			System.out.println("name的属性值是:" + obj2);
			
			/*
			 * 属性名是用户运行期间输入的,输入那个属性名这段程序就会输出那个属性的值!
			 * 也意味着,程序和属性之间是低耦合的关系
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
