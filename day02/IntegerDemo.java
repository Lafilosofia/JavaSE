package day02;
/**
 * 1.���ڻ�������û��������������,Ϊ�������ܲ��뵽�������Ŀ�����,javaΪ��8����������
 *   �ṩ�˶�Ӧ��8����װ��
 * 2.6����������صİ�װ��̳���java.lang.Number
 * Number��Byte Double Float Integer Long Short��ĸ���
 * Number��һ��������,�����˲�ͬ���͵�����֮�以��ת���ķ���,����6���������͵İ�װ�඼���Խ�
 * ���ʾ������������֮��ת��
 * 
 * int��Integer������:
 * 1.Integer��int��װ��,int����java��һ�ֻ�����������
 * 2.Integer����ʵ����֮�����ʹ��,��int��������Ҫ
 * 3.Integerʵ���Ƕ��������,��newһ��Integerʱ,ʵ����������һ��ָ��ָ��˶���,��int����ֱ�Ӵ�����
 * 4.Integer��Ĭ��ֵ��null,int��Ĭ��ֵ��0;
 * 
 * 
 * @author HP
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		Number d = 122.34;
		Number n = 7775;
		//���d��n��������������
		System.out.println(d.getClass().getName());
		System.out.println(n.getClass().getName());
		//����������ת��Ϊ��װ����
		int a = 2;
		int b = 2;
		Integer i1 = new Integer(a);//������һ���¶���
		System.out.println(i1.getClass().getName());
		
		//�Ƽ�ʹ�ð�װ��ľ�̬����valueOf()��ת��
		Integer i2 = Integer.valueOf(b);
		Integer i3 = Integer.valueOf(a);
		System.out.println(i2.getClass().getName());
		//���������ǱȽ�ֵ�Ĵ�С
		System.out.println(i2.equals(i3));//true
		System.out.println(i2 == i3);//true
		System.out.println(i2 == i1);//false
		
		/*
		 * �Ѱ�װ����ת��Ϊ��������:
		 * ����:Integerת��Ϊint������intValue();
		 */
		int a2 = i2.intValue();
		
	}
}
