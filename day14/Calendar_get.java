package day14;

import java.util.Calendar;

/**
 * Calendar�ṩ�˷���,get(int field)
 * ���ݸ�����ʱ�����(����ʱ�䵥λ)��ȡ��Ӧ��ֵ,ʱ��
 * ������һ��intֵ,����Ҫ����,Calendar�ṩ�˶�Ӧ�ĳ���
 * @author HP
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		//��ȡ��(��0��ʼ 0����һ��)
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		//��ȡ��
		int date = calendar.get(Calendar.DATE);
		System.out.println(date);
		
		//��ȡʱ  Calendar.HOUR_OF_DAY(24Сʱ��)��Calendar.HOUR(12Сʱ��)��һ����
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(h);
		
		//��ȡ��
		int m = calendar.get(Calendar.MINUTE);
		System.out.println(m);
		
		//��ȡ��
		int s = calendar.get(Calendar.SECOND);
		System.out.println(s);
		
		//��ȡ����ĵڼ���(�����ǽ���ĵڼ���)
		int d = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(d);
		
		//��ȡ���������ڼ� ������������Ϊһ�ܵĵ�һ��
		int dd = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dd);
		
		//�鿴���깲������
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
		
		//�鿴���¹�������
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//��һ����ÿ�����ж����� (2�²������ַ�ʽ��ѯ����ִ���)
		calendar.set(Calendar.YEAR, 2020);
		/*for(int i=0;i<12;i++){
			calendar.set(Calendar.MONTH, i);
			int cc=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println((i+1)+"����"+cc+"��!");
		}*/
		for(int i = 0;i < 12;i ++){
			calendar.set(Calendar.MONTH, i + 1);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			calendar.add(Calendar.DATE, -1);
			System.out.println((i + 1) + "����"+calendar.get(Calendar.DATE)+"��");
		}
		
	}
}
