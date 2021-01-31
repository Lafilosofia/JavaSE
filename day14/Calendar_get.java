package day14;

import java.util.Calendar;

/**
 * Calendar提供了方法,get(int field)
 * 根据给定的时间分量(各种时间单位)获取对应的值,时间
 * 分量是一个int值,不需要记忆,Calendar提供了对应的常量
 * @author HP
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取年
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		//获取月(从0开始 0代表一月)
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		//获取日
		int date = calendar.get(Calendar.DATE);
		System.out.println(date);
		
		//获取时  Calendar.HOUR_OF_DAY(24小时制)和Calendar.HOUR(12小时制)是一样的
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(h);
		
		//获取分
		int m = calendar.get(Calendar.MINUTE);
		System.out.println(m);
		
		//获取秒
		int s = calendar.get(Calendar.SECOND);
		System.out.println(s);
		
		//获取今年的第几天(现在是今年的第几天)
		int d = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(d);
		
		//获取今天是星期几 国外是以周日为一周的第一天
		int dd = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dd);
		
		//查看今年共多少天
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
		
		//查看本月共多少天
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//求一年中每个月有多少天 (2月采用这种方式查询会出现错误)
		calendar.set(Calendar.YEAR, 2020);
		/*for(int i=0;i<12;i++){
			calendar.set(Calendar.MONTH, i);
			int cc=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println((i+1)+"月有"+cc+"天!");
		}*/
		for(int i = 0;i < 12;i ++){
			calendar.set(Calendar.MONTH, i + 1);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			calendar.add(Calendar.DATE, -1);
			System.out.println((i + 1) + "月有"+calendar.get(Calendar.DATE)+"天");
		}
		
	}
}
