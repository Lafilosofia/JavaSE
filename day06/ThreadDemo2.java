package day06;
/**
 * �ڶ��ִ����̵߳ķ�ʽ:
 * ʵ��Runnable�ӿڵ��������߳�����
 * 
 * ʹ��Runnable�����������߳�:
 * ʵ��Runnable�ӿڲ���дrun�����������߳���,Ȼ���ٴ����̵߳�ʱ��
 * ��Runnable��ʵ�д��벢�����߳�;
 * 
 * �������ĺô����ڿ��Խ��߳����߳�Ҫִ�е�������벢������϶ȶ���һ����ʵ��Runnable�ӿ�,
 * ����һ����ʵ��Runnable�ӿ�,�������������Ը��õ�ȥʵ�����������ӿ�(�ӿ��Ƕ�̳й�ϵ)
 * @author 86180
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//��������
		Runnable r=new MyThread3();
		Runnable r2=new MyThread4();
		
		//�����߳�
		Thread t=new Thread(r);
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
		
	}
}

class MyThread3 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("hei,����,������ʶ�º���");
		}
		
	}
}

class MyThread4 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("����˭ѽ?");
		}
	}
}
