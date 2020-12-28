package day01;
/**
 * String类的相关常用方法
 * @author 86180
 *
 */
public class DemoString04 {
	public static void main(String[] args) {
		/*
		 * 使用length()方法检查字符串中字符的个数（字符串长度）
		 * 返回int类型
		 */
		String str = "你今天吃早点了吗";
		int n = str.length();
		System.out.println(n);
		
		/*
		 * String长度length()方法
		 * 数组长度是length属性
		 */
		int[] arr = {1,2,3,4,5};
		int n1 = arr.length;
		System.out.println(n1);
	}
}
