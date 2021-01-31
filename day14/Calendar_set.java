package day14;

import java.util.Calendar;
import java.util.Date;

/**
 * 设置指定时间分量所对应的值
 * int set(int field, int value);
 * @author HP
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		//2008-08-08 20:08:08
		//设置年份
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.get(Calendar.YEAR));
		
		//设置月份
		calendar.set(Calendar.MONTH, 7);
		System.out.println(calendar.get(Calendar.MONTH)+1);
		
		//设置日
		calendar.set(Calendar.DATE, 8);
		System.out.println(calendar.get(Calendar.DATE));
		
		//设置时
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		
		//设置分
		calendar.set(Calendar.MINUTE, 8);
		System.out.println(calendar.get(Calendar.MINUTE));
		
		//设置秒
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.get(Calendar.SECOND));
		
		//Calendar-->Date
		Date date=calendar.getTime();
		System.out.println(date);
		
	}
}
