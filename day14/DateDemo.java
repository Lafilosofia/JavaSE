package day14;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个具体的时间,
 * 内部维护了一个long值,记录的是自1970年1月1日 00:00:00
 * @author HP
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		//获取当前时间
		System.out.println(date);
		/*
		 * 获取Date内部维护的long(1970年1月1日 00:00:00 到现在的时间的毫秒数)
		 * Date提供了getTime()方法返回一个long类型.
		 */
		long time = date.getTime();
		System.out.println(time);
		/*
		 * Date提供了setTime(),把long类型的时间转换成Date形式
		 */
		date.setTime(time);
		System.out.println(date);
		
		//求明天的现在的这个点的时间
		//24小时用毫秒计算   1000*60*60*24
		time = time + 1000 * 60 * 60 * 24;
		System.out.println(time);
		date.setTime(time);
		System.out.println(date);
	}
}