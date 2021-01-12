package day06;
/**
 * 用匿名内部类形式完成线程的两种创建方式
 * @author 86180
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//方式一:匿名内部类直接创建Thread
		Thread t=new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("hei,妹子,我们认识下好吗");
				}
			}
		};
		
		
		//方式二:匿名内部类创建Runnable,再由线程运行
		Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("你是谁呀?");
				}	
			}
		};
		
		Thread th=new Thread(r);
		t.start();
		th.start();
	}
}