package day06;
/**
 * sleep睡眠阻塞
 * static void sleep(long ms)
 * 当一个线程执行sleep()方法后就会进去阻塞状态指定的毫秒数,
 * 超过线程会自动回到Runnable状态等待再次并发运行,该方法要求
 * 必须处理InterruptException,即:当一个线程处于睡眠阻塞时
 * 被其他线程调用interrupt()方法中断时会抛出该终端异常并打断
 * 睡眠阻塞
 * @author HP
 *
 */
public class SleepBlockDemo {
	public static void main(String[] args) {
		/*Thread t=new Thread(){
			public void run(){		
				try {
					System.out.println("等待时间为3s...");
					Thread.sleep(3000);
					System.out.println("结果出来了...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t.start();*/
		
		Thread lin = new Thread(){
			public void run(){
				System.out.println("lin:刚美完容,睡一会吧...");
				try {
					Thread.sleep(10000);
					System.out.println("睡的真香!");
				} catch (InterruptedException e) {
					System.out.println("lin:干嘛呢,干嘛呢,都破相了...");
				}
			}
		};
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("黄:我开始砸墙了!");
				for(int i = 0;i < 5;i ++){
					try {
						System.out.println("黄:80");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("咣当,搞定");
				lin.interrupt();//中断lin线程
			}
		};
		lin.start();
		huang.start();
	}
	
}

