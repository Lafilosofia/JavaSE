package day05;
/**
 * 常见的RuntimeException五种异常:
 * 1.制造空指针异常
 * NullPointerException
 * 
 * 2.制造数组越界异常
 * ArrayIndexOutOfBoundsException
 * 
 * 3.制造数学异常
 * ArithmeticException
 * 
 * 4.制造强制类型转换异常
 * ClassCastException
 * 
 * 5.制造数值格式化异常
 * NumberFormatException
 * 
 * @author HP
 *
 */
public class DemoTryCatch02 {
	public static void main(String[] args) {
		//NullPointerException  空指针异常
		//String str = null;
		//System.out.println(str.length());
		
		//ArrayIndexOutOfBoundsException  下标越界
		//int[] arr = new int[2];
		//System.out.println(arr[2]);
		
		//ArithmeticException  数学异常
		//double a = 5 / 0;
		//System.out.println(a);
		
		//ClassCastException  强制类型转换异常
		//Object obj = "hello";
		//System.out.println((Integer)obj);
		
		//NumberFormatException  数值格式化异常
		String str = "s";
		System.out.println(Integer.parseInt(str));
	}
}
