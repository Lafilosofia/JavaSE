package day11;
/**
 * Lambda表达式:
 * JDK1.8包含1.8之后推出的新特性
 * 简单的说,它是没有声明的方法,也就是没有访问的修饰词,返回值声明等
 * 
 * Lambda表达式用于创建匿名内部类所属的接口,必须只能有一个抽象方法,否则不可以使用Lambda表达式
 * 
 * 语法规则
 * (方法的参数)->{
 * 	方法体
 * };
 * 
 * Lambda表达式的标准格式:
 * 由三部分构成:
 * 1.一些参数
 * 2.一个箭头
 * 3.一段代码
 * 
 * 格式:
 * (参数列表)->{一些重要方法的代码};
 * 
 * 解释说明格式:
 * ():接口中的抽象方法的参数列表,没有参数就空着,有参数就写出参数,多个参数使用逗号隔开;
 * ->:传递的意思,把参数传递给方法体
 * {}:重写接口的抽象方法
 * @author Lenovo
 *
 */
public class LambdaDemo1 {
	
	public static void main(String[] args) {
		Test01 t = new Test01() {
			public void demo() {
				System.out.println("这是匿名内部类实现接口中的方法!");
			}
		};
		t.demo();
		
		//利用Lambda表达式实现接口中的方法
		//如果没有return返回或者方法体中代码只有一行则大括号可以省略
		Test01 lam = ()->{
			int a = 3;
			int b = 4;
			int c = a + b;
			System.out.println("这是Lambda表达式");
		};
		lam.demo();
		
	}
	
}
