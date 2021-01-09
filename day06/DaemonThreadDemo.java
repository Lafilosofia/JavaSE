package day06;
/**
 * 守护线程:
 * 守护线程又称后台线程，默认创建的线程都不是守护线程
 * 守护线程需要调用线程提供的方法设置:
 * void setDaamon(Boolean b)
 * 当参数为true时，线程变为守护线程
 * 
 * 守护线程使用与普通线程没区别，但是结束时有一个区别:
 * 当进程结束时，所有正在运行的守护线程回强制结束，也就是
 * 普通线程结束了，守护线程强制终止
 * @author 86180
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i = 0;i < 5;i ++){
					System.out.println("rose:let me go!");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					try{
						System.out.println("jack: you jump,i jump");
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		
		jack.setDaemon(true);//设置守护线程，注意：在start()方法调用之前设置
		rose.start();
		jack.start();
	}
}
