package day02;

import java.awt.Point;

/**
 * equals(Object obj)��ʾ:
 * �ص�֪ʶ:
 * equals��==����:
 * 1.==�ڻ������������ڱȽϱ�����ֵ,���������������,�Ƚϵ����������ñ����Ƿ�ָ��ͬһ������
 * 2.equals()��дObject�е�equals()����,��д�Ժ�������ڱȽ���������������Ƿ�һ��
 * @author HP
 *
 */
public class DemoEquals {
	public static void main(String[] args) {
		Point p=new Point(5,6);
		Point p2=new Point(5,6);
		System.out.println(p.equals(p2));
		/*String str=new String("ABC");
		String str02="ABC";
		System.out.println(str.equals(str02));*/
	}
}
