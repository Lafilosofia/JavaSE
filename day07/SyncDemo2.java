package day07;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ���¾�������߲���Ч��
 * 
 * ͬ����:
 * synchronized(ͬ��������){
 * 	��Ҫͬ�����еĴ���Ƭ��
 * }
 * ͬ������Ը����׼ȷ��������Ҫͬ�����еĴ���Ƭ��,
 * ��������Ч��Сͬ����Χ��߲���Ч��,
 * ������Ҫע��,���뱣֤����߳̿�����ͬ��������������"ͬһ��"�ſ���;
 * @author 86180
 *
 */

public class SyncDemo2 {
	public static void main(String[] args) {
		Shop shop=new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	public void buy(){
		try {
			Thread name=Thread.currentThread();
			System.out.println(name.getName()+"���·�");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(name.getName()+"���·�");
				Thread.sleep(5000);
			}
			System.out.println(name.getName()+"�����뿪");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}