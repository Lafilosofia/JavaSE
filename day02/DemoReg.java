package day02;
/**
 * 正则表达式简介:
 * 实际开发中,经常需要对字符串数据进行一些复杂的匹配,查找,替换等操作,通过"正则表达式",
 * 可以方便的实现字符串的复杂操作.
 * 什么是正则表达式:
 * 1. 正则本来就是一个字符串
 * 2. 正则用于检索目标字符串中的规则
 * 3. 正则是规定字符串是否合理
 * 4. 正则需要解析器执行,Java提供了相关的解析器处理API
 * 5. 常见的编程语言大部分都支持提供正则API
 * 例如:正则表达式"[a-z]"表示a到z的任意一个字符
 * 正则表达式"[a-z]+"表示1个或者多个a-z字符组成的字符串
 * matcher(正则表达式)方法:将一个字符串与正则表达式进行匹配,如果匹配成功就返回true,否则返回false;
 * @author 86180
 *
 */
public class DemoReg {
	int age;
	public static void main(String[] args) {
		String regex1="[a-z]";
		String regex2="[^a-z]";
		String regex3="[a-z&&[^bc]]";
		String regex4="\\d";    //[0-9]
		String regex5="\\D";    //[^0-9]
		String regex6="\\s";    //[\t]
		String regex7="\\S";    //[^\s]
		String regex8="\\w";    //[a-zA-Z_0-9]
		String regex9="\\W";    //[^\w]
		
		//System.out.println("a".matches(regex1));//true
		//System.out.println("b".matches(regex2));//false
		//System.out.println("f".matches(regex3));//true
		//System.out.println("2".matches(regex4));//true
		//System.out.println("2".matches(regex5));//false
		//System.out.println(" ".matches(regex6));//true
		//System.out.println("s".matches(regex7));//true
		//System.out.println("-".matches(regex8));//false
		//System.out.println("_".matches(regex9));//false
		//System.out.println("s2".matches(regex8));//false
		//System.out.println("c".matches(regex3));//false
		
		//字符串"\\."和"."必须放在matches()方法的参数中,才能正常比较
		//System.out.println(regex10.matches(regex11));//true
		//System.out.println(regex11.matches(regex10));//false
				
		//System.out.println(regex10);//输出"."
		//System.out.println(regex11);//输出"\."
	}
	
}
