package day02;
/**
 * ������ʽ���:
 * ʵ�ʿ�����,������Ҫ���ַ������ݽ���һЩ���ӵ�ƥ��,����,�滻�Ȳ���,ͨ��"������ʽ",
 * ���Է����ʵ���ַ����ĸ��Ӳ���.
 * ʲô��������ʽ:
 * 1. ����������һ���ַ���
 * 2. �������ڼ���Ŀ���ַ����еĹ���
 * 3. �����ǹ涨�ַ����Ƿ����
 * 4. ������Ҫ������ִ��,Java�ṩ����صĽ���������API
 * 5. �����ı�����Դ󲿷ֶ�֧���ṩ����API
 * ����:������ʽ"[a-z]"��ʾa��z������һ���ַ�
 * ������ʽ"[a-z]+"��ʾ1�����߶��a-z�ַ���ɵ��ַ���
 * matcher(������ʽ)����:��һ���ַ�����������ʽ����ƥ��,���ƥ��ɹ��ͷ���true,���򷵻�false;
 * @author 86180
 *
 */
public class DemoReg {
	int age;
	public static void main(String[] args) {
		String regex1="[a-z]";
		String regex2="[^a-z]";
		String regex3="[a-z&&[^bc]]";
		String regex4="\\d";    //[0-9]
		String regex5="\\D";    //[^0-9]
		String regex6="\\s";    //[\t]
		String regex7="\\S";    //[^\s]
		String regex8="\\w";    //[a-zA-Z_0-9]
		String regex9="\\W";    //[^\w]
		
		//System.out.println("a".matches(regex1));//true
		//System.out.println("b".matches(regex2));//false
		//System.out.println("f".matches(regex3));//true
		//System.out.println("2".matches(regex4));//true
		//System.out.println("2".matches(regex5));//false
		//System.out.println(" ".matches(regex6));//true
		//System.out.println("s".matches(regex7));//true
		//System.out.println("-".matches(regex8));//false
		//System.out.println("_".matches(regex9));//false
		//System.out.println("s2".matches(regex8));//false
		//System.out.println("c".matches(regex3));//false
		
		//�ַ���"\\."��"."�������matches()�����Ĳ�����,���������Ƚ�
		//System.out.println(regex10.matches(regex11));//true
		//System.out.println(regex11.matches(regex10));//false
				
		//System.out.println(regex10);//���"."
		//System.out.println(regex11);//���"\."
	}
	
}
