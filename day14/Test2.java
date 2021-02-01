package day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期:
 * 促销日规划:商品过期日前两周(14天)的周三为促销日;
 * 
 * 程序启动后要求用户输入商品的生产日期,例如:2020-07-30
 * 
 * 输入保质期,如21天
 * 经过计算,算出促销日是哪一天
 * 
 * 分析:
 * 用户输入的是一个字符串-->Date-->Calendar
 * @author HP
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期,例如:2020-08-04");
		String dateStr = scanner.nextLine();
		System.out.println("请输入保质期天数:");
		int days = scanner.nextInt();
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//生产日期
			//将字符串形式转换为Date形式
			Date date = sdf.parse(dateStr);
			
			Calendar calendar = Calendar.getInstance();
			//将Date形式转换为Calendar
			calendar.setTime(date);
			
			//计算过期日
			calendar.add(Calendar.DAY_OF_YEAR, days);
			//计算过期日的前两周(促销日)
			calendar.add(Calendar.DAY_OF_YEAR, -14);
			//设置为促销日的那个周的周三
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			
			//将Calendar转换为Date
			date = calendar.getTime();
			//将Date转换为字符串
			String time = sdf.format(date);
			System.out.println("促销日为:"+time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
