package day06;
/**
 * �鿴�߳���Ϣ����ط���
 * @author 86180
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		//��ȡ�߳�id
		long id = t.getId();
		System.out.println(id);
		//��ȡ�̵߳�����
		String name = t.getName();
		System.out.println(name);
		//��ȡ�̵߳����ȼ�
		int p = t.getPriority();
		System.out.println(p);
		//�ж��߳��Ƿ����
		boolean b = t.isAlive();
		System.out.println(b);
		//�ж��߳��Ƿ��Ǻ�̨�̣߳��ػ��̣߳�
		boolean b1 = t.isDaemon();
		System.out.println(b1);
		//�ж��߳��Ƿ��ж�
		boolean b2 = t.isInterrupted();
		System.out.println(b2);
	}
}
