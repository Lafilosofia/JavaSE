package day06;
/**
 * �������ڲ�����ʽ����̵߳����ִ�����ʽ
 * @author 86180
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//��ʽһ:�����ڲ���ֱ�Ӵ���Thread
		Thread t=new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("hei,����,������ʶ�º���");
				}
			}
		};
		
		
		//��ʽ��:�����ڲ��ഴ��Runnable,�����߳�����
		Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("����˭ѽ?");
				}	
			}
		};
		
		Thread th=new Thread(r);
		t.start();
		th.start();
	}
}