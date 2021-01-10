package day06;
/**
 * �߳��ṩ��һ������:
 * void join()
 * �÷�������һ���߳�����һ���߳��ϵȴ�,ֱ����ִ����Ϻ��ټ���ִ��,
 * ����������Э���߳�֮���"ͬ��"����
 * 
 * ͬ������:����ִ�����Ⱥ�˳��(���߳�������ͬ��,���߳�Ҳ���Խ���ͬ�����в���);
 * �첽����:�����ִ�и���(���߳������д������첽��)
 * @author HP
 *
 */
public class JoinDemo {
	public static void main(String[] args) {
		//�����߳�
		Thread download = new Thread(){
			public void run(){
				try{
					System.out.println("��Ӱ��ʼ����...");
					for(int i = 0;i < 100;i ++){
						System.out.println("���ؽ���:" + i + "%");
						Thread.sleep(50);
					}
					System.out.println("��Ӱ�������!");
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		//��ʾ�߳�
		Thread show = new Thread(){
			public void run(){
				try {
					download.join();
					System.out.println("��ʼ���ŵ�Ӱ...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		download.start();
		show.start();
	}
}
