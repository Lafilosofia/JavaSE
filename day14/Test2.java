package day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ������Ʒ��������:
 * �����չ滮:��Ʒ������ǰ����(14��)������Ϊ������;
 * 
 * ����������Ҫ���û�������Ʒ����������,����:2020-07-30
 * 
 * ���뱣����,��21��
 * ��������,�������������һ��
 * 
 * ����:
 * �û��������һ���ַ���-->Date-->Calendar
 * @author HP
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������,����:2020-08-04");
		String dateStr = scanner.nextLine();
		System.out.println("�����뱣��������:");
		int days = scanner.nextInt();
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//��������
			//���ַ�����ʽת��ΪDate��ʽ
			Date date = sdf.parse(dateStr);
			
			Calendar calendar = Calendar.getInstance();
			//��Date��ʽת��ΪCalendar
			calendar.setTime(date);
			
			//���������
			calendar.add(Calendar.DAY_OF_YEAR, days);
			//��������յ�ǰ����(������)
			calendar.add(Calendar.DAY_OF_YEAR, -14);
			//����Ϊ�����յ��Ǹ��ܵ�����
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			
			//��Calendarת��ΪDate
			date = calendar.getTime();
			//��Dateת��Ϊ�ַ���
			String time = sdf.format(date);
			System.out.println("������Ϊ:"+time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
