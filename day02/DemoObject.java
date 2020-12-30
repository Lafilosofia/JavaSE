package day02;



/**
 * Object(顶级父类):
 * 所有的类都有一个父类叫Object,默认的父类是java.lang.Object
 * Object类型的引用变量可指向任何类型对象(向上造型)
 * 
 * Object常见方法:
 * toString():返回String类型,该方法的意义是将当前对象转换为一个字符串
 * Object已经实现了该方法,返回的字符串是当前对象句柄(引用),格式为包名.类名@散列码,
 * 该字符串在实际开发中的意义不大,所以通常需要使用这个方法时需要重写
 * @author HP
 *
 */
public class DemoObject {
	public static void main(String[] args) {
		/*
		 * toString()方法是非常有用的调试工具(一般返回的是类中的成员变量),
		 * 强烈建议自定义的对象重写toString()方法
		 */
		Person p = new Person("测试",30);
		//System.out.println(任意对象);//直接调用toString()方法,在这里toString()可以省略
		System.out.println(p.toString());
		System.out.println(p);
	}
}
