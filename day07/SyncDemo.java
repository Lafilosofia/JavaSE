package day07;
/**
 * ���̲߳�����ȫ����:
 * 	������̲߳������в���ͳһ����ʱ,�����߳��л���ʱ�����ɿ���,
 * 	���ܵ��²���������ʱ�Ĺ���δ���ճ�����Ƶ�ִ��˳�����е���
 * 	�������ֻ���,����ʱ���ܻᵼ��ϵͳ̱��
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
					Thread.yield();//ģ���߳��л�
					System.out.println(getName()+":"+b);
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				while(true){
					int b1=table.getBean();
					Thread.yield();//ģ���߳��л�
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
	 *yield()����������:��ͣ��ǰ����ִ�е��̶߳���(������ǰӵ�е�CPU��Դ),��ִ��
	 *�����߳�;
	 *yield()�õ�ǰ�����̻߳ص�������״̬,�����������ͬ���ȼ��������̻߳������
	 *����,�����п���Ч��û��
	 */
	
	/*
	 * ��һ��������synchronized���κ�,��ô�÷�����Ϊ"ͬ������"����߳�
	 * ����ͬʱ���뷽������,��������˳���һ��һ������,�����ͱ�����
	 * ������ȫ����
	 */
	public synchronized int getBean(){
		if(bean==0){
			throw new RuntimeException("û�ж�����!");
		}
		Thread.yield();//ģ���߳��л�
		return bean--;
	}
}
