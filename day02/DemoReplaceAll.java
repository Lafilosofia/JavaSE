package day02;
/**
 * replaceAll(String regex,String str)方法:
 * String提供了用于字符串替换的方法
 * replaceAll(String regex,String str):将字符串中匹配正则表达式regex的字符串替换成str
 * replace():替换部分数据(不能用正则表达式)
 * @author HP
 *
 */
public class DemoReplaceAll {
	public static void main(String[] args) {
		/*
		 * replace():替换部分数据(不能用正则表达式)
		 */
		String str = "sadh13sad15qwe16sdafr121231";
		System.out.println(str);
		/*str=str.replace("13", "呵呵");//把"13"替换成"呵呵"
		System.out.println(str);*/
		
		/*
		 * replaceAll(String regex,String String str):将字符串中匹配正则表达式regex的字符串替换成str
		 */
		//str=str.replaceAll("13|15|16|121231", "数字");
		str = str.replaceAll("\\d+", "数字");
		System.out.println(str);
	}
}