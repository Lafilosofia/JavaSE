package day06;
/**
 * sleep˯������
 * static void sleep(long ms)
 * ��һ���߳�ִ��sleep()������ͻ��ȥ����״ָ̬���ĺ�����,
 * �����̻߳��Զ��ص�Runnable״̬�ȴ��ٴβ�������,�÷���Ҫ��
 * ���봦��InterruptException,��:��һ���̴߳���˯������ʱ
 * �������̵߳���interrupt()�����ж�ʱ���׳����ն��쳣�����
 * ˯������
 * @author HP
 *
 */
public class SleepBlockDemo {
	public static void main(String[] args) {
		/*Thread t=new Thread(){
			public void run(){		
				try {
					System.out.println("�ȴ�ʱ��Ϊ3s...");
					Thread.sleep(3000);
					System.out.println("���������...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t.start();*/
		
		Thread lin = new Thread(){
			public void run(){
				System.out.println("lin:��������,˯һ���...");
				try {
					Thread.sleep(10000);
					System.out.println("˯������!");
				} catch (InterruptedException e) {
					System.out.println("lin:������,������,��������...");
				}
			}
		};
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("��:�ҿ�ʼ��ǽ��!");
				for(int i = 0;i < 5;i ++){
					try {
						System.out.println("��:80");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("�۵�,�㶨");
				lin.interrupt();//�ж�lin�߳�
			}
		};
		lin.start();
		huang.start();
	}
	
}

