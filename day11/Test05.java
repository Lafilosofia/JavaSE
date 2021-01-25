package day11;
/**
 * @FunctionalInterface
 * 校验此接口是否满足Lambda表达式:
 * 在JDK1.7版本以上,推出了在接口里面也可以写普通方法,但是
 * 一定要在方法前面加上"default"或"public static"
 * @author HP
 *
 */
@FunctionalInterface
public interface Test05 {
	/*void test();
	void test02();
	int test03();*/
	String test04(int age, String name);
	
	/*default int test05(){
		return 0;
	}
	
	public static int test06(){
		return 1;
	}*/
}
