package day01;
/**
 * trim()ȥ���ַ������˿հ�
 * @author 86180
 *
 */
public class DemoString07 {
	public static void main(String[] args) {
		/*
		 * ȥ����ǰ�ַ��������˿հ�
		 * trim()����ַ��������пհ��򷵻�����ַ�����һ������û�пհ׵ĸ���
		 * ����ַ�������û�пհ�,������ַ���ֻ��һ���汾
		 * ������һ������,�洢�ڶ���,����û�д洢�ڶ��еĳ�������
		 */
		String str = "	 Tom		";
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str.length());
		str = " 	T	O	M	";
		str = str.trim();
		System.out.println(str);
		
		String s = "Tom";
		String s1 = s.trim();
		System.out.println(str);
		
		String s2 = "Tom";
		String s3 = s.trim();
		System.out.println(s == s1);
		
	}
}
