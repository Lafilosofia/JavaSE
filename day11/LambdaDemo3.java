package day11;
/**
 * Lambda���ʽ
 * �з���ֵ,û�в���
 * @author HP
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		//�����ڲ���
		/*Test03 t = new Test03() {
			
			public int demo3() {
				return 9;
			}
		};
		int result = t.demo3();
		System.out.println(result);*/
		
		//Lambda���ʽ
		/*
		 * 1.����з���ֵ,����û�з�����ʱ,����ʡ��return,����ҲҪʡ�Դ�����
		 * 2.return��{}����ͬʱ�л���
		 */
		Test03 t = ()->9;//����()->{return 9;};
		int result = t.demo3();
		System.out.println(result);
	}
}
