package day11;
/**
 * Lambda表达式
 * 有返回值,没有参数
 * @author HP
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		//匿名内部类
		/*Test03 t = new Test03() {
			
			public int demo3() {
				return 9;
			}
		};
		int result = t.demo3();
		System.out.println(result);*/
		
		//Lambda表达式
		/*
		 * 1.如果有返回值,并且没有方法体时,可以省略return,但是也要省略大括号
		 * 2.return和{}必须同时有或无
		 */
		Test03 t = ()->9;//或者()->{return 9;};
		int result = t.demo3();
		System.out.println(result);
	}
}
