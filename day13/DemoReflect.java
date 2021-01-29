package day13;
/**
 * 反射:
 * 1.Java提供了一套API
 * 2.提供了检查一个对象内部的手段
 * 3.反射API可以
 * 		动态加载类,
 * 		动态创建对象,
 * 		动态访问属性,
 * 		动态调用方法
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoReflect {
	public static void main(String[] args) {
		test("ABC");
		//test('A');
		//test(1);
		/*List<String> list=new ArrayList<String>();
		Iterator<String> it=list.iterator();
		Class cls=it.getClass();
		System.out.println(cls);*/
	}
	
	public static void test(Object obj){
		//通过反射可以检查类型的内部结构,动态获取obj的类型
		//Object类提供了getClass()返回一个Class类
		Class cls = obj.getClass();
		System.out.println(cls);
		/*
		 * 检查对象的类型中声明了哪些属性
		 * Declared:声明的(定义)
		 * Field:字段,属性
		 */
		//获取对象中的所有属性
		Field[] field = cls.getDeclaredFields();
		for(Field f : field){
			//System.out.println(f);
		}
		
		/*
		 * 获取对象中的指定属性
		 * Class类提供了getDeclaredField(String name)
		 * name:对象中的属性
		 */
		try {
			Field fel = cls.getDeclaredField("hash");
			//System.out.println(fel); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * 获取对象中的所有方法
		 * Method方法来自reflect包,代表Class中声明的方法信息
		 */
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m);
		}
		
		/*
		 * 获取对象中指定的方法
		 * getDeclaredMethod(String name,parameterTypes types);
		 * name:方法名字;
		 * types:方法中的参数类型,多个参数用","隔开
		 */
		try {
			//Method mt=cls.getDeclaredMethod("hashCode");//没有参数
			Method mt = cls.getDeclaredMethod("compareTo", String.class);//一个参数
			//Method mt=cls.getDeclaredMethod("indexOf",int.class,int.class);//两个参数
			System.out.println("指定的方法是:"+mt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * 获取对象中的所有构造方法
		 * Constructor
		 */
		Constructor[] con = cls.getDeclaredConstructors();
		for(Constructor c : con){
			System.out.println("对象中的构造方法:"+c);
		}
		
		//获取对象中的指定构造方法
		try {
			Constructor co = cls.getDeclaredConstructor(byte[].class,String.class);
			System.out.println("对象中指定的构造方法"+co);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
