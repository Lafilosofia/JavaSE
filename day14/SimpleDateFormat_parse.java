package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��һ���ַ���ת��ΪDate
 * @author HP
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) {
		String str = "2021-05-23 16:35:39";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * SimpleDateFormat�ṩ��һ������parse()ת��ΪDate
		 * ���ַ���ת��ΪDate
		 */
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
