package day11;
/**
 * ����Lambda���ʽ
 * �߳�����
 * @author HP
 *
 */
public class LambdaDemo5 {
	public static void main(String[] args) {
		/*Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("�߳�����");
			}
			
		};
		r.run();*/
		
		Runnable r = ()->{
			System.out.println("�߳�����");
		};
		r.run();
		
	}
}
