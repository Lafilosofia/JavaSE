package day06;
/**
 * �ػ��߳�:
 * �ػ��߳��ֳƺ�̨�̣߳�Ĭ�ϴ������̶߳������ػ��߳�
 * �ػ��߳���Ҫ�����߳��ṩ�ķ�������:
 * void setDaamon(Boolean b)
 * ������Ϊtrueʱ���̱߳�Ϊ�ػ��߳�
 * 
 * �ػ��߳�ʹ������ͨ�߳�û���𣬵��ǽ���ʱ��һ������:
 * �����̽���ʱ�������������е��ػ��̻߳�ǿ�ƽ�����Ҳ����
 * ��ͨ�߳̽����ˣ��ػ��߳�ǿ����ֹ
 * @author 86180
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i = 0;i < 5;i ++){
					System.out.println("rose:let me go!");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					try{
						System.out.println("jack: you jump,i jump");
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		
		jack.setDaemon(true);//�����ػ��̣߳�ע�⣺��start()��������֮ǰ����
		rose.start();
		jack.start();
	}
}
