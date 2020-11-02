package day01;
/**
 * trim()去除字符串两端空白
 * @author 86180
 *
 */
public class DemoString07 {
	public static void main(String[] args) {
		/*
		 * 去除当前字符串的两端空白
		 * trim()如果字符串两端有空白则返回这个字符串的一个两端没有空白的副本
		 * 如果字符串两端没有空白,则这个字符串只有一个版本
		 * 副本是一个变量,存储在堆中,但是没有存储在堆中的常量池中
		 */
		String str = "	 Tom		";
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str.length());
		str = " 	T	O	M	";
		str = str.trim();
		System.out.println(str);
		
		String s = "Tom";
		String s1 = s.trim();
		System.out.println(str);
		
		String s2 = "Tom";
		String s3 = s.trim();
		System.out.println(s == s1);
		
	}
}
