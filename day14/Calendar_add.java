package day14;

import java.util.Calendar;

/**
 * ʱ�����
 * void add(int field, int mount)
 * ָ����ʱ���������ָ����ֵ,��������ֵ�Ǹ������Ǽ���
 * @author HP
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		//����3��2������25�����ڵ��ܵ���һ������?
		//��3��
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		
		//��2��
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		
		//��25��
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		//����Ϊ��һ
		calendar.set(Calendar.DAY_OF_WEEK, 2);
		System.out.println(calendar.getTime());
		
		//��������ֵΪ����,���ʾ����
		calendar.add(Calendar.DAY_OF_YEAR, -3);;
		System.out.println(calendar.getTime());
	}
}
