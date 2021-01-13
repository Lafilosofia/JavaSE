package day07;
/**
 * 互斥锁:
 * 使用synchronized锁定多段代码,而锁的对象相同时,这些
 * 代码片段之间就是互斥锁,多个线程不能同时执行这些方法;
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
			System.out.println(name.getName()+"正在运行A方法!");
			Thread.sleep(5000);
			System.out.println(name.getName()+"正在运行A方法完毕!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void method02(){
		try {
			System.out.println(name.getName()+"正在运行B方法!");
			Thread.sleep(5000);
			System.out.println(name.getName()+"正在运行B方法完毕!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
