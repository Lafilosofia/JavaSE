package day14;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * 日历类
 * Calendar本身是一个抽象类,定义了日历类操作时间的相关方法,其提供了一个静态方法getInstance()
 * 可以根据系统所在地区获取一个使用的实现类,大部分地区获取的是GregorianCalendar
 * @author HP
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//日历类默认也表示当前系统时间
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Calendar可以和Date之间相互转换
		 * Calendar提供了方法:Date getTime();
		 * 该方法可以将当前Calendar所表示的日期以Date形式返回
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * Date转换为Calendar,
		 * Calendar提供了方法,void setTime(Date date)
		 * 使当前Calendar表示给定的Date所表示的日期
		 */
		calendar.setTime(date);;
		System.out.println(calendar);
	}
}
