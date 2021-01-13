package day07;
/**
 * 有效的缩小同步范围可以在保证并发安全的前提下尽可能提高并发效率
 * 
 * 同步块:
 * synchronized(同步监视器){
 * 	需要同步运行的代码片段
 * }
 * 同步块可以更灵活准确的锁定需要同步运行的代码片段,
 * 这样可有效缩小同步范围提高并发效率,
 * 但是需要注意,必须保证多个线程看到的同步监视器对象是"同一个"才可以;
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
			System.out.println(name.getName()+"挑衣服");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(name.getName()+"试衣服");
				Thread.sleep(5000);
			}
			System.out.println(name.getName()+"结账离开");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}