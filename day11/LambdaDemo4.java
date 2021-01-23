package day11;
/**
 * Lambda表达式
 * 有参数,也有返回值
 * @author Lenovo
 *
 */
public class LambdaDemo4 {
	public static void main(String[] args) {
		/*Test04 t=new Test04() {
			
			public double demo4(int a, double b) {
				return a+b;
			}
		};
		double result=t.demo4(2, 3.5);
		System.out.println(result);*/
		
		//Lambda表达式
		Test04 t=(a, b)->{
			System.out.println("Lamda有参数,也有返回值");
			return a+b;
		};
		double result=t.demo4(2, 3.5);
		System.out.println(result);
	}
}
