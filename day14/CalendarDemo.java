package day14;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * ������
 * Calendar������һ��������,���������������ʱ�����ط���,���ṩ��һ����̬����getInstance()
 * ���Ը���ϵͳ���ڵ�����ȡһ��ʹ�õ�ʵ����,�󲿷ֵ�����ȡ����GregorianCalendar
 * @author HP
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//������Ĭ��Ҳ��ʾ��ǰϵͳʱ��
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Calendar���Ժ�Date֮���໥ת��
		 * Calendar�ṩ�˷���:Date getTime();
		 * �÷������Խ���ǰCalendar����ʾ��������Date��ʽ����
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * Dateת��ΪCalendar,
		 * Calendar�ṩ�˷���,void setTime(Date date)
		 * ʹ��ǰCalendar��ʾ������Date����ʾ������
		 */
		calendar.setTime(date);;
		System.out.println(calendar);
	}
}
