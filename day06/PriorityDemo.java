package day06;
/**
 * 线程优先级：
 * 线程调用start方法后纳入线程调度统一管理，线程不能主动
 * 获取CPU时间片段，只能被动分配调整线程优先级
 * 可以最大程度的改善某个线程获取CPU时间片段的几率。
 * 理论上线程优先级越高的线程获取CPU时间片段的次数越多
 * 
 * 线程优先级有十个等级，用整数1-10表示，1最低，5默认，10最高
 * 
 * 
 * @author 86180
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run(){
				for(int i = 0;i < 100;i ++){
					System.out.println("MAX");
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i = 0;i < 1000;i ++){
					System.out.println("NOR");
				}
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				for(int i = 0;i < 1000;i ++){
					System.out.println("MIN");
				}
			}
		};
		
		t.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t.start();
		t2.start();
		t3.start();
	}
}
