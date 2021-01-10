package day06;
/**
 * �߳����ȼ���
 * �̵߳���start�����������̵߳���ͳһ�����̲߳�������
 * ��ȡCPUʱ��Ƭ�Σ�ֻ�ܱ�����������߳����ȼ�
 * �������̶ȵĸ���ĳ���̻߳�ȡCPUʱ��Ƭ�εļ��ʡ�
 * �������߳����ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ�εĴ���Խ��
 * 
 * �߳����ȼ���ʮ���ȼ���������1-10��ʾ��1��ͣ�5Ĭ�ϣ�10���
 * 
 * 
 * @author 86180
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run(){
				for(int i = 0;i < 100;i ++){
					System.out.println("MAX");
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i = 0;i < 1000;i ++){
					System.out.println("NOR");
				}
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				for(int i = 0;i < 1000;i ++){
					System.out.println("MIN");
				}
			}
		};
		
		t.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t.start();
		t2.start();
		t3.start();
	}
}
