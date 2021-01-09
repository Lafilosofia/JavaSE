package day06;
/**
 * 线程提供了一个静态方法:
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程,
 * java中所有的代码都是线程运行的,main方法也不例外,
 * JVM启动后会启动一个线程来执行main方法,通常我们称执行main
 * 方法的线程为"主线程".
 * @author 86180
 *
 */
public class CurrentThreadDemo {
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("运行dosome方法的线程是:"+t);
	}
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		/*
		 * Thread[main,5,main]
		 * [线程名字,优先级别,线程组]
		 */
		System.out.println(main);
		
		Thread t2 = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("自定义线程:" + t);
				dosome();
			}
		};
		t2.start();
	}
}
