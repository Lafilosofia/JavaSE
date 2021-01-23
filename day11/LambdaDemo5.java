package day11;
/**
 * 利用Lambda表达式
 * 线程任务
 * @author HP
 *
 */
public class LambdaDemo5 {
	public static void main(String[] args) {
		/*Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("线程任务");
			}
			
		};
		r.run();*/
		
		Runnable r = ()->{
			System.out.println("线程任务");
		};
		r.run();
		
	}
}
