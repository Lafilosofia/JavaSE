package day01;
/**
 * String类的相关常用方法
 * indexOf()检查字符串中字符/字符串出现的位置
 * 
 * @author 86180
 *
 */
public class DemoString05 {
	public static void main(String[] args) {
		//		012345678910.....
		String str = "http://ykt.comindex.html";
		//如果字符串中检查斜线"/"出现的位置，如果找到第一个字符的位置就返回这个位置
		//如果没有找到指定的字符，则返回1
		int n = str.indexOf("u");
		System.out.println(n);
		
		String str1 = "Lafilosofia";
		int m = str1.indexOf("f");
		System.out.println(m);
		
	}
}
