package day07;
/**
 * 多线程并发安全问题:
 * 	当多个线程并发运行操作统一数据时,由于线程切换的时机不可控制,
 * 	可能导致操作该数据时的过程未按照程序设计的执行顺序运行导致
 * 	操作出现混论,严重时可能会导致系统瘫痪
 * 
 * @author 86180
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		Table table=new Table();
		
		Thread t1=new Thread(){
			public void run(){
				while(true){
					int b=table.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(getName()+":"+b);
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				while(true){
					int b1=table.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(getName()+":"+b1);
				}
			}
		};
		t1.start();
		t2.start();
		
	}
}
class Table{
	private int bean=20;
	/*
	 *yield()方法作用是:暂停当前正在执行的线程对象(放弃当前拥有的CPU资源),并执行
	 *其他线程;
	 *yield()让当前运行线程回到可运行状态,以允许具有相同优先级的其它线程获得运行
	 *机会,但是有可能效果没用
	 */
	
	/*
	 * 当一个方法用synchronized修饰后,那么该方法变为"同步方法"多个线程
	 * 不能同时进入方法运行,而必须有顺序的一个一个运行,这样就避免了
	 * 并发安全问题
	 */
	public synchronized int getBean(){
		if(bean==0){
			throw new RuntimeException("没有豆子了!");
		}
		Thread.yield();//模拟线程切换
		return bean--;
	}
}
