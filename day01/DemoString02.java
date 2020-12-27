package day01;
/**
 * String是不可改变对象
 * java.lang.String使用了final修饰，不能被继承
 * 字符串一旦创建，对象将永远无法改变，但字符串引用重新赋值
 * String常量池
 * java为提高性能，静态字符串（字面量/常量/字符串连接的结果）在常量池中创建，
 * 并尽量使用同一个对象，重用静态字符串
 *  
 * 对应重复出现的字符串，JVM会首先在常量池中查找。如果存在即可返回该对象
 * @author 86180
 *
 */
public class DemoString02 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = s1;
		/*
		 * "==" 用于基本类型比较变量的值大小
		 * 在引用变量中：说明两个引用是否指向同一个对象
		 */
		System.out.println(s1 == s2);
		String s3 = "ABC";
		String s4 = "ABC";
		//s3和s4引用同一个对象，优点是重用字符串对象
		System.out.println(s3 == s4);
		
		String s5 = "A";
		String s6 = s5 + "BC";
		//创建动态新字符串对象，不会被常量池优化，与静态字符串"ABC"不是同一个对象
		System.out.println(s3 == s6);//false
		
	}
}
