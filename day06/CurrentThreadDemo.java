package day06;
/**
 * �߳��ṩ��һ����̬����:
 * static Thread currentThread()
 * �÷������Ի�ȡ��������������߳�,
 * java�����еĴ��붼���߳����е�,main����Ҳ������,
 * JVM�����������һ���߳���ִ��main����,ͨ�����ǳ�ִ��main
 * �������߳�Ϊ"���߳�".
 * @author 86180
 *
 */
public class CurrentThreadDemo {
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������߳���:"+t);
	}
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		/*
		 * Thread[main,5,main]
		 * [�߳�����,���ȼ���,�߳���]
		 */
		System.out.println(main);
		
		Thread t2 = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����߳�:" + t);
				dosome();
			}
		};
		t2.start();
	}
}
