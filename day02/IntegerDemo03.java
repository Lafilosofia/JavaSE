package day02;
/**
 * 包装类都提供了一个静态方法:parseXX(String str)
 * 可以将字符串解析为对应的基本类型数据，但是前提是
 * 该字符串描述的数据能被基本类型正确表示
 * @author 86180
 *
 */
public class IntegerDemo03 {
	public static void main(String[] args) {
		String str = "123";
		//把字符串转换为int类型
		int n = Integer.parseInt(str);
		int n1 = Integer.valueOf(str);
		System.out.println(n1);
		
		//把字符串类型转换为double基本类型
		double b = Double.parseDouble(str);
		System.out.println(b);
	}
}
