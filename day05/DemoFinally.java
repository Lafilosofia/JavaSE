package day05;
/**
 * finally块:
 * finally块只能定义在异常处理机制的最后,可以直接跟在try后面或者最后一个
 * catch之后,finally可以保证只要程序运行到try中,那么无论try当中的代码片段
 * 是否出现异常,finally块里面的代码都必须执行;
 * 
 * 通常把释放资源等操作放在finally中,比如:流的关闭;
 * 
 * 注意:finally是在return之前执行
 * @authorHP
 *
 */
public class DemoFinally {
	public static void main(String[] args) {
		System.out.println("程序开始执行");
		try{
			String str = "hassasd";
			System.out.println(str.charAt(2));
			return ;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("释放资源");
		}
	}
}
