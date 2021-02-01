package day14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������,Ҫ���û������Լ��ĳ�������,��ʽ��:2008-08-08,
 * Ȼ��ͨ���������,���������Ϊֹ��һ�����˶�����
 * ������Լ�����10000��ļ���������һ��?
 * @author HP
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ĳ�������(��ʽ:2008-08-08):");
		String birthday = scanner.nextLine();
		long day = 1000 * 60 * 60 * 24;//һ��ĺ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//���ַ���ת��ΪDate
			Date bir = sdf.parse(birthday);
			//1970-01-01���������һ��ĺ�����
			long birTime = bir.getTime();
			
			//1970-01-01�����ڵ�ǰʱ��ĺ�����
			Date now = new Date();
			long nowTime = now.getTime();
			
			/*
			 * ���������� �� ���ڵ�ǰʱ��ĺ�����
			 * (1970-01-01�����ڵ�ǰʱ��ĺ����� ��ȥ 1970-01-01���������һ��ĺ�����),
			 * ����������ת��Ϊ����
			 */
			long lifeDay = (nowTime-birTime)/day;
			System.out.println("��ϲ��,һ������:" + lifeDay + "��,���������!");
			
			long specialTime = birTime + 10000 * day;
			Date specialDate = new Date();
			specialDate.setTime(specialTime);
			String specialDateStr = sdf.format(specialDate);
			System.out.println("����10000��ļ�����:" + specialDateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
