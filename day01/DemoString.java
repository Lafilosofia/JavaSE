package day01;
/**
 * String���ص�:
 * String����Ҳ����������ν��"�ַ�������",
 * �ַ������󲻿ɸı�,�ַ������ñ������Ըı�
 * @author HP
 * �ڻ�������(8������)��"=="�Ƚϵ���ֵ�Ĵ�С
 * int a=9; int b=10; if(a==b){}
 * �����ñ�����"=="�Ƚϵ���:�Ƿ�ָ��ͬһ����������Ƿ�ָ��ͬһ��������
 */
public class DemoString {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = s1;
		String s3 = "ABCDEF";
		s1 = s1 + "DEF" ;//�ַ���ƴ��
				
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s3);
		System.err.println(s1 == s2);
	}
}
