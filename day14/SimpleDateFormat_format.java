package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 可以将字符串与Data之间按照指定的日期格式进行相互转换
 * @author HP
 *
 */
public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * 2020-07-28 15:38:59
		 * yyyy-MM-dd HH:mm:ss
		 * 或
		 * 2020年07月29日 15时59分32秒
		 * yyyy年MM月dd日 HH时mm分ss秒
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * SimpleDateFormat提供了一个format()方法转换为String类型
		 * 将Date形式转换为字符串形式
		 */
		String str = sdf.format(now);
		System.out.println(str);
	}
}
