package day08;
/**
 * JDK1.5֮���Ƴ���һ���µ���������forѭ����Ҳ����ѭ��
 * 
 * ��ѭ������ȡ����ͳ��forѭ���Ĺ������������������ϻ�����ʹ��
 * 
 * @author 86180
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three"};
		for(int i = 0;i < array.length;i ++){
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * ��ѭ��ʱ�������Ͽɣ����������ڱ���Դ����ʱ��Ϊʹ�ô�ͳforѭ����������
		 */
		
		for(String s:array){
			System.out.println(s);
		}
}
}