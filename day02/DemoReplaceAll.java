package day02;
/**
 * replaceAll(String regex,String str)����:
 * String�ṩ�������ַ����滻�ķ���
 * replaceAll(String regex,String str):���ַ�����ƥ��������ʽregex���ַ����滻��str
 * replace():�滻��������(������������ʽ)
 * @author HP
 *
 */
public class DemoReplaceAll {
	public static void main(String[] args) {
		/*
		 * replace():�滻��������(������������ʽ)
		 */
		String str = "sadh13sad15qwe16sdafr121231";
		System.out.println(str);
		/*str=str.replace("13", "�Ǻ�");//��"13"�滻��"�Ǻ�"
		System.out.println(str);*/
		
		/*
		 * replaceAll(String regex,String String str):���ַ�����ƥ��������ʽregex���ַ����滻��str
		 */
		//str=str.replaceAll("13|15|16|121231", "����");
		str = str.replaceAll("\\d+", "����");
		System.out.println(str);
	}
}