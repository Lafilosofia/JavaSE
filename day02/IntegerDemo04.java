package day02;
/**
 * JDK1.5֮���Ƴ���һ���µ�����,�Զ���װ��
 * �������Ǳ������Ͽ�,������JVM
 * �������ڱ������ʱ�����������������װ���ͻ���ʱ���Զ���ȫ����֮��ת���Ĵ���,
 * ������������������Դ�����б�дʱ���ٿ��ǻ�ת
 * @author HP
 *
 */
public class IntegerDemo04 {
	public static void main(String[] args) {
		int a = 2;
		//Integer n = new Integer(a);
		Integer n = Integer.valueOf(a);
		int a1 = n.intValue();
		
		int i1 = n;
		/*
		 * int i1=n;
		 * �������Զ���װ������,�������Ὣ����ı�Ϊint i1=new Integer(2).intValue();
		 */
		Integer i2 = a;
	}
}
