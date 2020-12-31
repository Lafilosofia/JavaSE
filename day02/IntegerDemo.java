package day02;
/**
 * 1.由于基本类型没有面向对象的特征,为了他们能参与到面向对象的开发中,java为这8个基本类型
 *   提供了对应的8个包装类
 * 2.6个和数字相关的包装类继承自java.lang.Number
 * Number是Byte Double Float Integer Long Short类的父类
 * Number是一个抽象类,定义了不同类型的数字之间互相转换的方法,所以6个数字类型的包装类都可以将
 * 其表示基本类型在这之间转换
 * 
 * int和Integer的区别:
 * 1.Integer是int包装类,int则是java的一种基本数据类型
 * 2.Integer变量实例化之后才能使用,而int变量不需要
 * 3.Integer实际是对象的引用,当new一个Integer时,实际上是生成一个指针指向此对象,而int则是直接存数据
 * 4.Integer的默认值是null,int的默认值是0;
 * 
 * 
 * @author HP
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		Number d = 122.34;
		Number n = 7775;
		//输出d和n对象所述的类型
		System.out.println(d.getClass().getName());
		System.out.println(n.getClass().getName());
		//将基本类型转换为包装类型
		int a = 2;
		int b = 2;
		Integer i1 = new Integer(a);//创建了一个新对象
		System.out.println(i1.getClass().getName());
		
		//推荐使用包装类的静态方法valueOf()来转换
		Integer i2 = Integer.valueOf(b);
		Integer i3 = Integer.valueOf(a);
		System.out.println(i2.getClass().getName());
		//基本类型是比较值的大小
		System.out.println(i2.equals(i3));//true
		System.out.println(i2 == i3);//true
		System.out.println(i2 == i1);//false
		
		/*
		 * 把包装类型转换为基本类型:
		 * 比如:Integer转换为int类型用intValue();
		 */
		int a2 = i2.intValue();
		
	}
}
