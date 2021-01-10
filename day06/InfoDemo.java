package day06;
/**
 * 查看线程信息的相关方法
 * @author 86180
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		//获取线程id
		long id = t.getId();
		System.out.println(id);
		//获取线程的名字
		String name = t.getName();
		System.out.println(name);
		//获取线程的优先级
		int p = t.getPriority();
		System.out.println(p);
		//判断线程是否活着
		boolean b = t.isAlive();
		System.out.println(b);
		//判断线程是否是后台线程（守护线程）
		boolean b1 = t.isDaemon();
		System.out.println(b1);
		//判断线程是否被中断
		boolean b2 = t.isInterrupted();
		System.out.println(b2);
	}
}
