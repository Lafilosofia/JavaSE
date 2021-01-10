package day06;
/**
 * 线程提供了一个方法:
 * void join()
 * 该方法允许一个线程在另一个线程上等待,直到其执行完毕后再继续执行,
 * 这样做可以协调线程之间的"同步"运行
 * 
 * 同步运行:代码执行有先后顺序(单线程运行是同步,多线程也可以进行同步运行操作);
 * 异步运行:代码各执行各的(多线程下运行代码是异步的)
 * @author HP
 *
 */
public class JoinDemo {
	public static void main(String[] args) {
		//下载线程
		Thread download = new Thread(){
			public void run(){
				try{
					System.out.println("电影开始下载...");
					for(int i = 0;i < 100;i ++){
						System.out.println("下载进度:" + i + "%");
						Thread.sleep(50);
					}
					System.out.println("电影下载完毕!");
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		//显示线程
		Thread show = new Thread(){
			public void run(){
				try {
					download.join();
					System.out.println("开始播放电影...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		download.start();
		show.start();
	}
}
