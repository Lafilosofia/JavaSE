package day14;

import java.util.Calendar;

/**
 * 时间操作
 * void add(int field, int mount)
 * 指定的时间分量加上指定的值,若给定的值是负数则是减法
 * @author HP
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		//设置3年2个月零25天所在的周的周一是哪天?
		//加3年
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		
		//加2月
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		
		//加25天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		//设置为周一
		calendar.set(Calendar.DAY_OF_WEEK, 2);
		System.out.println(calendar.getTime());
		
		//若给定的值为负数,则表示减法
		calendar.add(Calendar.DAY_OF_YEAR, -3);;
		System.out.println(calendar.getTime());
	}
}
