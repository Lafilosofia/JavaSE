package day14;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ�������ʱ��,
 * �ڲ�ά����һ��longֵ,��¼������1970��1��1�� 00:00:00
 * @author HP
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		//��ȡ��ǰʱ��
		System.out.println(date);
		/*
		 * ��ȡDate�ڲ�ά����long(1970��1��1�� 00:00:00 �����ڵ�ʱ��ĺ�����)
		 * Date�ṩ��getTime()��������һ��long����.
		 */
		long time = date.getTime();
		System.out.println(time);
		/*
		 * Date�ṩ��setTime(),��long���͵�ʱ��ת����Date��ʽ
		 */
		date.setTime(time);
		System.out.println(date);
		
		//����������ڵ�������ʱ��
		//24Сʱ�ú������   1000*60*60*24
		time = time + 1000 * 60 * 60 * 24;
		System.out.println(time);
		date.setTime(time);
		System.out.println(date);
	}
}