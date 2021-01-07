package day05;
/**
 * ������RuntimeException�����쳣:
 * 1.�����ָ���쳣
 * NullPointerException
 * 
 * 2.��������Խ���쳣
 * ArrayIndexOutOfBoundsException
 * 
 * 3.������ѧ�쳣
 * ArithmeticException
 * 
 * 4.����ǿ������ת���쳣
 * ClassCastException
 * 
 * 5.������ֵ��ʽ���쳣
 * NumberFormatException
 * 
 * @author HP
 *
 */
public class DemoTryCatch02 {
	public static void main(String[] args) {
		//NullPointerException  ��ָ���쳣
		//String str = null;
		//System.out.println(str.length());
		
		//ArrayIndexOutOfBoundsException  �±�Խ��
		//int[] arr = new int[2];
		//System.out.println(arr[2]);
		
		//ArithmeticException  ��ѧ�쳣
		//double a = 5 / 0;
		//System.out.println(a);
		
		//ClassCastException  ǿ������ת���쳣
		//Object obj = "hello";
		//System.out.println((Integer)obj);
		
		//NumberFormatException  ��ֵ��ʽ���쳣
		String str = "s";
		System.out.println(Integer.parseInt(str));
	}
}
