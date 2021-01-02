package day02;
/**
 * JDK1.5之后推出的一个新的特性,自动拆装箱
 * 该特性是编译器认可,而不是JVM
 * 编译器在编译代码时若遇到基本类型与包装类型互用时会自动补全它们之间转换的代码,
 * 这样做可以让我们在源代码中编写时不再考虑互转
 * @author HP
 *
 */
public class IntegerDemo04 {
	public static void main(String[] args) {
		int a = 2;
		//Integer n = new Integer(a);
		Integer n = Integer.valueOf(a);
		int a1 = n.intValue();
		
		int i1 = n;
		/*
		 * int i1=n;
		 * 触发了自动拆装箱特性,编译器会将代码改变为int i1=new Integer(2).intValue();
		 */
		Integer i2 = a;
	}
}
