package day01;
/**
 * String���ṩ��split()
 * split(String str) str�Ƿָ������һ���ַ�������
 * @author HP
 *
 */
public class DemoString09 {
	public static void main(String[] args) {
		String str="���,�濵��,��������ѧϰ,java";
		String[] strArr=str.split(",");
		System.out.println(strArr.length);
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
	}
}
