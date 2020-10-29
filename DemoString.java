package day01;
/**
 * String的特点:
 * String类型也就是我们所谓的"字符串类型",
 * 字符串对象不可改变,字符串引用变量可以改变
 * @author HP
 * 在基本类型(8个类型)用"=="比较的是值的大小
 * int a=9; int b=10; if(a==b){}
 * 在引用变量中"=="比较的是:是否指向同一个对象或者是否指向同一个常量池
 */
public class DemoString {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = s1;
		String s3 = "ABCDEF";
		s1 = s1 + "DEF" ;//字符串拼接
				
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s3);
		System.err.println(s1 == s2);
	}
}
