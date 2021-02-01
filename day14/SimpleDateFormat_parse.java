package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串转换为Date
 * @author HP
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) {
		String str = "2021-05-23 16:35:39";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * SimpleDateFormat提供了一个方法parse()转换为Date
		 * 将字符串转换为Date
		 */
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
