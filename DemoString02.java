package day01;
/**
 * String�ǲ��ɸı����
 * java.lang.Stringʹ����final���Σ����ܱ��̳�
 * �ַ���һ��������������Զ�޷��ı䣬���ַ����������¸�ֵ
 * String������
 * javaΪ������ܣ���̬�ַ�����������/����/�ַ������ӵĽ�����ڳ������д�����
 * ������ʹ��ͬһ���������þ�̬�ַ���
 *  
 * ��Ӧ�ظ����ֵ��ַ�����JVM�������ڳ������в��ҡ�������ڼ��ɷ��ظö���
 * @author 86180
 *
 */
public class DemoString02 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = s1;
		/*
		 * "==" ���ڻ������ͱȽϱ�����ֵ��С
		 * �����ñ����У�˵�����������Ƿ�ָ��ͬһ������
		 */
		System.out.println(s1 == s2);
		String s3 = "ABC";
		String s4 = "ABC";
		//s3��s4����ͬһ�������ŵ��������ַ�������
		System.out.println(s3 == s4);
		
		String s5 = "A";
		String s6 = s5 + "BC";
		//������̬���ַ������󣬲��ᱻ�������Ż����뾲̬�ַ���"ABC"����ͬһ������
		System.out.println(s3 == s6);//false
		
	}
}
