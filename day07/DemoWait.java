package day07;
/**
 * 1.wait是Object类中的方法，而sleep是Thread类中的方法。
   2.最主要的是sleep方法调用之后，并没有释放锁。使得线程仍然可以同步控制,sleep不会让出系统资源；
     sleep方法可以在任何地方使用,而wait方法只能在synchronized方法或synchronized块中使用,
	否则会扔出”java.lang.IllegalMonitorStateException“异常。wait方法不仅让出CPU，还会释放已经占有的同步资源锁
	3.sleep必须捕获异常，而wait，notify和notifyAll不需要捕获异常
	4.sleep()是让某个线程暂停运行一段时间,其控制范围是由当前线程决定,主动权在自己"手里",而wait(),这是	  由某个确定的对象来调用的,主动权在某个对象"手里"
 * @author 86180
 *
 */
public class DemoWait {
	public static void main(String[] args) {
//		Thread t=new My();
//		Thread t2=new My();
//		Thread t3=new My();
//		t.start();
//		t2.start();
//		t3.start();
		Thread t1=new My();
		Thread t2=new My2();
		t1.start();
		t2.start();
		
	}
}
class My extends Thread{
	public static StringBuilder value=new StringBuilder();
	public void run(){
		String name=Thread.currentThread().getName();
		synchronized (value) {
			for(int i=0;i<5;i++){
				try {
					value.wait(10000);//完全释放锁
					//Thread.sleep(1000);不释放锁
					value.append("a");
					System.out.println(name+":"+value.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
}

//唤醒wait状态
class My2 extends Thread{
	public void run(){
		synchronized (My.value) {
			for(int i=0;i<2;i++){
				try {
					Thread.sleep(2000);
					System.out.println("呵呵");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			My.value.notify();//唤醒wait()状态
		}	
		
	}
}
