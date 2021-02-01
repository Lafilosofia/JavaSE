package day14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后,要求用户输入自己的出生日期,格式如:2008-08-08,
 * 然后通过程序计算,输出到今天为止你一共活了多少天
 * 再输出自己出生10000天的纪念日是哪一天?
 * @author HP
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的出生日期(格式:2008-08-08):");
		String birthday = scanner.nextLine();
		long day = 1000 * 60 * 60 * 24;//一天的毫秒数
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//将字符串转换为Date
			Date bir = sdf.parse(birthday);
			//1970-01-01到你出生这一天的毫秒数
			long birTime = bir.getTime();
			
			//1970-01-01到现在当前时间的毫秒数
			Date now = new Date();
			long nowTime = now.getTime();
			
			/*
			 * 出生的那天 到 现在当前时间的毫秒数
			 * (1970-01-01到现在当前时间的毫秒数 减去 1970-01-01到你出生这一天的毫秒数),
			 * 并将毫秒数转换为天数
			 */
			long lifeDay = (nowTime-birTime)/day;
			System.out.println("恭喜你,一共活了:" + lifeDay + "天,请继续保持!");
			
			long specialTime = birTime + 10000 * day;
			Date specialDate = new Date();
			specialDate.setTime(specialTime);
			String specialDateStr = sdf.format(specialDate);
			System.out.println("出生10000天的纪念日:" + specialDateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
