package day11;
/**
 * Lambda���ʽ
 * �в���,Ҳ�з���ֵ
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
		
		//Lambda���ʽ
		Test04 t=(a, b)->{
			System.out.println("Lamda�в���,Ҳ�з���ֵ");
			return a+b;
		};
		double result=t.demo4(2, 3.5);
		System.out.println(result);
	}
}
