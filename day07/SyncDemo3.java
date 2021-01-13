package day07;
/**
 * ������:
 * ʹ��synchronized������δ���,�����Ķ�����ͬʱ,��Щ
 * ����Ƭ��֮����ǻ�����,����̲߳���ͬʱִ����Щ����;
 * @author 86180
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Boo b=new Boo();
		Thread t1=new Thread(){
			public void run(){
				b.method01();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				b.method02();
			}
		};
		t1.start();
		t2.start();
	}
}
class Boo{
	Thread name=Thread.currentThread();
	public synchronized  void method01(){
		try {
			System.out.println(name.getName()+"��������A����!");
			Thread.sleep(5000);
			System.out.println(name.getName()+"��������A�������!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void method02(){
		try {
			System.out.println(name.getName()+"��������B����!");
			Thread.sleep(5000);
			System.out.println(name.getName()+"��������B�������!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
