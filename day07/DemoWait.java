package day07;
/**
 * 1.wait��Object���еķ�������sleep��Thread���еķ�����
   2.����Ҫ����sleep��������֮�󣬲�û���ͷ�����ʹ���߳���Ȼ����ͬ������,sleep�����ó�ϵͳ��Դ��
     sleep�����������κεط�ʹ��,��wait����ֻ����synchronized������synchronized����ʹ��,
	������ӳ���java.lang.IllegalMonitorStateException���쳣��wait���������ó�CPU�������ͷ��Ѿ�ռ�е�ͬ����Դ��
	3.sleep���벶���쳣����wait��notify��notifyAll����Ҫ�����쳣
	4.sleep()����ĳ���߳���ͣ����һ��ʱ��,����Ʒ�Χ���ɵ�ǰ�߳̾���,����Ȩ���Լ�"����",��wait(),����	  ��ĳ��ȷ���Ķ��������õ�,����Ȩ��ĳ������"����"
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
					value.wait(10000);//��ȫ�ͷ���
					//Thread.sleep(1000);���ͷ���
					value.append("a");
					System.out.println(name+":"+value.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
}

//����wait״̬
class My2 extends Thread{
	public void run(){
		synchronized (My.value) {
			for(int i=0;i<2;i++){
				try {
					Thread.sleep(2000);
					System.out.println("�Ǻ�");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			My.value.notify();//����wait()״̬
		}	
		
	}
}
