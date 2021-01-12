package day06;
/**
 * 第二种创建线程的方式:
 * 实现Runnable接口单独定义线程任务
 * 
 * 使用Runnable创建并启动线程:
 * 实现Runnable接口并重写run方法来定义线程体,然后再创建线程的时候
 * 将Runnable的实列传入并启动线程;
 * 
 * 这样做的好处在于可以将线程与线程要执行的任务分离并减少耦合度定义一个类实现Runnable接口,
 * 定义一个类实现Runnable接口,这样的作法可以更好的去实现其他父类或接口(接口是多继承关系)
 * @author 86180
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//创建任务
		Runnable r=new MyThread3();
		Runnable r2=new MyThread4();
		
		//创建线程
		Thread t=new Thread(r);
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
		
	}
}

class MyThread3 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("hei,妹子,我们认识下好吗");
		}
		
	}
}

class MyThread4 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("你是谁呀?");
		}
	}
}
