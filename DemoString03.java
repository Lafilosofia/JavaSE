package day01;

public class DemoString03 {
	public static void main(String[] args) {
		/*
		 * 经典面试题 01
		 */
		String str = new String("DEF");
		//如上代码执行期间创建了几个字符串对象 答案：B
		//A.1	B.2	C.3		D.4
		
		/*
		 * 经典面试题 02
		 */
		String s1 = new String("A" + "BC");
		//如上代码执行期间创建了几个字符串对象 答案：B
		//A.1	B.2		C.3		D.4
	}
}
