package day11;
/**
 * Lambda���ʽ
 * �в���ʽ
 * @author Lenovo
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		/*Test02 t=new Test02() {
			
			public void demo2(int a) {
				System.out.println("a��ֵ��:"+a);
			}
		};
		t.demo2(8);*/
		
		//Lambda���ʽд
		/*
		 * 1.�ڽӿ��еķ����б�(����)����ʡ������
		 * 2.���������ֻ��һ�����������ʡ�Ե�()
		 */
		Test02 t=a->{
			System.out.println("a��ֵ��:"+a);
		};
		t.demo2(8);
		
		Test02_2 t2=(age, name)->{
			System.out.println("�ҵ����ֽ�:"+name+",�ҵ�����:"+age);
		};
		t2.demo02(18, "�ڹ�");
	}
}
