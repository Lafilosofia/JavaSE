package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���Խ��ַ�����Data֮�䰴��ָ�������ڸ�ʽ�����໥ת��
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
		 * ��
		 * 2020��07��29�� 15ʱ59��32��
		 * yyyy��MM��dd�� HHʱmm��ss��
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * SimpleDateFormat�ṩ��һ��format()����ת��ΪString����
		 * ��Date��ʽת��Ϊ�ַ�����ʽ
		 */
		String str = sdf.format(now);
		System.out.println(str);
	}
}
