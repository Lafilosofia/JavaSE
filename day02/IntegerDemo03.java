package day02;
/**
 * ��װ�඼�ṩ��һ����̬����:parseXX(String str)
 * ���Խ��ַ�������Ϊ��Ӧ�Ļ����������ݣ�����ǰ����
 * ���ַ��������������ܱ�����������ȷ��ʾ
 * @author 86180
 *
 */
public class IntegerDemo03 {
	public static void main(String[] args) {
		String str = "123";
		//���ַ���ת��Ϊint����
		int n = Integer.parseInt(str);
		int n1 = Integer.valueOf(str);
		System.out.println(n1);
		
		//���ַ�������ת��Ϊdouble��������
		double b = Double.parseDouble(str);
		System.out.println(b);
	}
}
