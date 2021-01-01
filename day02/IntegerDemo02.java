package day02;
/**
 * 数字类型包装类都支持两个常量；
 * MAX_VALUE,MIN_VALUE
 * 分别表示对应的基本类型的取值范围
 * @author 86180
 *
 */
public class IntegerDemo02 {
	public static void main(String[] args) {
		//获取int最大值
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		//获取int最小值
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		//获取long最大值
		long max2 = Long.MAX_VALUE;
		System.out.println(max2);
		//获取long最小值
		long min2 = Long.MIN_VALUE;
		System.out.println(min2);
	}
}
