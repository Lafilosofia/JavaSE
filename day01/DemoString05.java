package day01;
/**
 * String�����س��÷���
 * indexOf()����ַ������ַ�/�ַ������ֵ�λ��
 * 
 * @author 86180
 *
 */
public class DemoString05 {
	public static void main(String[] args) {
		//		012345678910.....
		String str = "http://ykt.comindex.html";
		//����ַ����м��б��"/"���ֵ�λ�ã�����ҵ���һ���ַ���λ�þͷ������λ��
		//���û���ҵ�ָ�����ַ����򷵻�1
		int n = str.indexOf("u");
		System.out.println(n);
		
		String str1 = "Lafilosofia";
		int m = str1.indexOf("f");
		System.out.println(m);
		
	}
}
