package day05;
/**
 * 异常的抛出:
 * throw关键字,用于将一个异常抛出.
 * 通常两种情况会主动抛出一个异常:
 * 1.程序遇到一个满足语法要求,但是不满足业务逻辑要求的时候可主动抛出一个异常给调用者
 * 
 * 2.程序出现了异常,但是不应当在当前代码片段中解决,该异常时可以抛给调用者
 * 
 * 当我们调用一个含有throws声明异常抛出的方法时,编译器要求我们必须处理这个异常,
 * 处理方式有两种:
 * 1.try-catch字节捕获异常并处理
 * 2.在当前方法上继续使用throws声明将该异常抛出,你们调用者需要来处理这个相关异常
 * @author HP
 *
 */
public class DemoException02 {
	public static void main(String[] args) {
		Person p = new Person();
		try{
			p.setAge(1000);
		}catch(AgeException e){
			System.out.println(e.getMessage());
		}
	}
}
